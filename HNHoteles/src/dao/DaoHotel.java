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
                        rs.getInt("numbre_phone"),
                        rs.getInt("foundation_year"),
                        rs.getInt("Id_ typeLodging"),
                        rs.getInt("hotel_size"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("country"),
                        rs.getString("check_in"),
                        rs.getString("check_out"),
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
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `hotel` (`id`, `Id_typeLodging`, `name`, `address`, `country`, `number_phone`, `foundation_year`, `hotel_size`, `check_in`, `check_out`, `requirements`, `stars`) VALUES (NULL, '");
            query.append(hotel.getId_typeLodging());
            query.append("', '");
            query.append(hotel.getName());
            query.append("', '");
            query.append(hotel.getAddress());
            query.append("', '");
            query.append(hotel.getCountry());
            query.append("', '");
            query.append(hotel.getNumber_phone());
            query.append("', '");
            query.append(hotel.getFoundation_year());
            query.append("', '");
            query.append(hotel.getHotel_size());
            query.append("', '");
            query.append(hotel.getCheck_in());
            query.append("', '");
            query.append(hotel.getCheck_out());
            query.append("', '");
            query.append(hotel.getRequirements());
            query.append("', '");
            query.append(hotel.getStars());
            query.append("')");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query.toString());

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
