package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoHotelInterface;
import model.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoHotel implements DaoHotelInterface {
    @Override
    public ArrayList<Hotel> getAllHotel() {
        ArrayList<Hotel> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM hotel";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Hotel hotel = new Hotel(
                        rs.getInt("id"),
                        rs.getInt("number_phone"),
                        rs.getInt("foundation_year"),
                        rs.getInt("id_typeLodging"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("country"),
                        rs.getInt("check_in"),
                        rs.getInt("check_out"),
                        rs.getString("requirements"),
                        rs.getInt("stars")
                );

                list.add(hotel);
            }

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Hotel getHotel(int id_Hotel) {
        return null;
    }

    @Override
    public void updateHotel(Hotel hotel) {

    }

    @Override
    public void deleteHotel(Hotel hotel) {

    }

    @Override
    public void addHotel(Hotel hotel) {

    }
}
