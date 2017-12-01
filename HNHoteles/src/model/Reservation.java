package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Reservation {

    private IntegerProperty id;
    private IntegerProperty id_user;
    private IntegerProperty entry_date;
    private IntegerProperty departure_date;
    private IntegerProperty quantity_nights;
    private IntegerProperty total_rooms;

    public Reservation(int id, int id_user, int entry_date, int departure_date, int quantity_nights, int total_rooms) {
        this.id = new SimpleIntegerProperty(id);
        this.id_user = new SimpleIntegerProperty (id_user);
        this.entry_date = new SimpleIntegerProperty (entry_date); //DATETIME
        this.departure_date = new SimpleIntegerProperty (departure_date); //DATETIME
        this.quantity_nights = new SimpleIntegerProperty (quantity_nights);
        this.total_rooms = new SimpleIntegerProperty (total_rooms);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getId_user() {
        return id_user.get();
    }

    public IntegerProperty id_userProperty() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user.set(id_user);
    }

    public int getEntry_date() {
        return entry_date.get();
    }

    public IntegerProperty entry_dateProperty() {
        return entry_date;
    }

    public void setEntry_date(int entry_date) {
        this.entry_date.set(entry_date);
    }

    public int getDeparture_date() {
        return departure_date.get();
    }

    public IntegerProperty departure_dateProperty() {
        return departure_date;
    }

    public void setDeparture_date(int departure_date) {
        this.departure_date.set(departure_date);
    }

    public int getQuantity_nights() {
        return quantity_nights.get();
    }

    public IntegerProperty quantity_nightsProperty() {
        return quantity_nights;
    }

    public void setQuantity_nights(int quantity_nights) {
        this.quantity_nights.set(quantity_nights);
    }

    public int getTotal_rooms() {
        return total_rooms.get();
    }

    public IntegerProperty total_roomsProperty() {
        return total_rooms;
    }

    public void setTotal_rooms(int total_rooms) {
        this.total_rooms.set(total_rooms);
    }
}
