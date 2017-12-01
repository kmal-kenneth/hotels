package model;

import javafx.beans.property.*;

public class Room {

    private IntegerProperty id;
    private IntegerProperty id_season;
    private IntegerProperty id_typeRoom;
    private IntegerProperty id_hotel;
    private StringProperty name;
    private FloatProperty price;

    public Room(int id, int id_season, int id_typeRoom, int id_hotel, String name, float price) {
        this.id = new SimpleIntegerProperty(id);
        this.id_season = new SimpleIntegerProperty (id_season);
        this.id_typeRoom = new SimpleIntegerProperty (id_typeRoom);
        this.id_hotel = new SimpleIntegerProperty (id_hotel);
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleFloatProperty(price);
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

    public int getId_season() {
        return id_season.get();
    }

    public IntegerProperty id_seasonProperty() {
        return id_season;
    }

    public void setId_season(int id_season) {
        this.id_season.set(id_season);
    }

    public int getId_typeRoom() {
        return id_typeRoom.get();
    }

    public IntegerProperty id_typeRoomProperty() {
        return id_typeRoom;
    }

    public void setId_typeRoom(int id_typeRoom) {
        this.id_typeRoom.set(id_typeRoom);
    }

    public int getId_hotel() {
        return id_hotel.get();
    }

    public IntegerProperty id_hotelProperty() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel.set(id_hotel);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public float getPrice() {
        return price.get();
    }

    public FloatProperty priceProperty() {
        return price;
    }

    public void setPrice(float price) {
        this.price.set(price);
    }
}
