package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Reservation_Room {

    private IntegerProperty id_room;
    private IntegerProperty id_reservation;
    private IntegerProperty id_person;
    private IntegerProperty adults_quantity;
    private IntegerProperty amount_children;

    public Reservation_Room(int id_room, int id_reservation, int id_person, int adults_quantity, int amount_children) {
        this.id_room = new SimpleIntegerProperty(id_room);
        this.id_reservation = new SimpleIntegerProperty (id_reservation);
        this.id_person = new SimpleIntegerProperty (id_person);
        this.adults_quantity = new SimpleIntegerProperty (adults_quantity);
        this.amount_children = new SimpleIntegerProperty (amount_children);
    }

    public int getId_room() {
        return id_room.get();
    }

    public IntegerProperty id_roomProperty() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room.set(id_room);
    }

    public int getId_reservation() {
        return id_reservation.get();
    }

    public IntegerProperty id_reservationProperty() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation.set(id_reservation);
    }

    public int getId_person() {
        return id_person.get();
    }

    public IntegerProperty id_personProperty() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person.set(id_person);
    }

    public int getAdults_quantity() {
        return adults_quantity.get();
    }

    public IntegerProperty adults_quantityProperty() {
        return adults_quantity;
    }

    public void setAdults_quantity(int adults_quantity) {
        this.adults_quantity.set(adults_quantity);
    }

    public int getAmount_children() {
        return amount_children.get();
    }

    public IntegerProperty amount_childrenProperty() {
        return amount_children;
    }

    public void setAmount_children(int amount_children) {
        this.amount_children.set(amount_children);
    }
}
