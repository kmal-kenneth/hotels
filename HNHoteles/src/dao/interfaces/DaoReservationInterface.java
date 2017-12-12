package dao.interfaces;

import model.Reservation;

import java.util.ArrayList;

public interface DaoReservationInterface {

    public ArrayList<Reservation> getReservation();
    public Reservation getReservation(int id_Reservation);
    public void updateReservation(Reservation reservation);
    public void deleteReservation(Reservation reservation);
    public void addReservation(Reservation reservation);
}
