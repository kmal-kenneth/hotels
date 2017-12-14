package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoReservation_RoomInterface;
import model.Reservation_Room;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoReservation_Room implements DaoReservation_RoomInterface {
    @Override
    public ArrayList<Reservation_Room> getAllReservation_Room() {
        ArrayList<Reservation_Room> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM reservation_room";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Reservation_Room reservation_room = new Reservation_Room(
                        rs.getInt("id_room"),
                        rs.getInt("id_reservation"),
                        rs.getInt("id_person"),
                        rs.getInt("adults_quantity"),
                        rs.getInt("amount_children")
                );

                list.add(reservation_room);
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
    public Reservation_Room getReservation_Room(int idReservation) {
        return null;
    }

    @Override
    public void updateReservation_Room(Reservation_Room reservation_Room) {

    }

    @Override
    public void deleteReservation_Room(Reservation_Room reservation_Room) {

    }

    @Override
    public void addReservation_Room(Reservation_Room reservation_Room) {

    }
}
