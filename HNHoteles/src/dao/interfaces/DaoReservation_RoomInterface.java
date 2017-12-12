package dao.interfaces;

import model.Reservation_Room;

import java.util.ArrayList;

public interface DaoReservation_RoomInterface {

    public ArrayList<Reservation_Room> getReservation_Room();
    public Reservation_Room getReservation_Room(int idReservation);
    public void updateReservation_Room(Reservation_Room reservation_Room);
    public void deleteReservation_Room(Reservation_Room reservation_Room);
    public void addReservation_Room(Reservation_Room reservation_Room);
}
