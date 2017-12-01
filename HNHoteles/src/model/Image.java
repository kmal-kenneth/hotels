package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Image {

    private IntegerProperty id;
    private IntegerProperty id_hotel;
    //PHOTOGRAPHIES HERE!!


    public Image(int id, int id_hotel) {
        this.id = new SimpleIntegerProperty(id);
        this.id_hotel = new SimpleIntegerProperty (id_hotel);
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

    public int getId_hotel() {
        return id_hotel.get();
    }

    public IntegerProperty id_hotelProperty() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel.set(id_hotel);
    }
}
