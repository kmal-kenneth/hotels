package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoReservationInterface;
import model.Reservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoReservation implements DaoReservationInterface {
    @Override
    public ArrayList<Reservation> getAllReservation() {
        ArrayList<Reservation> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM reservation";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Reservation reservation = new Reservation(
                        rs.getInt("id"),
                        rs.getInt("id_user"),
                        rs.getInt("entry_date"),
                        rs.getInt("departure_date"),
                        rs.getInt("quantity_nights"),
                        rs.getInt("total_rooms")
                );

                list.add(reservation);
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
    public Reservation getReservation(int id_Reservation) {
        return null;
    }

    @Override
    public void updateReservation(Reservation reservation) {

    }

    @Override
    public void deleteReservation(Reservation reservation) {

    }

    @Override
    public void addReservation(Reservation reservation) {

    }
}
