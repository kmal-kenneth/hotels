package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Attractive_Hotel {

    private IntegerProperty id_attractive;
    private IntegerProperty id_hotel;

    public Attractive_Hotel(int id_Attractive, int id_Hotel) {
        this.id_attractive = new SimpleIntegerProperty(id_Attractive);
        this.id_hotel = new SimpleIntegerProperty(id_Hotel);
    }

    public int getId_attractive() {
        return id_attractive.get();
    }

    public IntegerProperty id_attractiveProperty() {
        return id_attractive;
    }

    public void setId_attractive(int id_attractive) {
        this.id_attractive.set(id_attractive);
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
