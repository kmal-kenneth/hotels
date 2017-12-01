package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Service_Hotel {

    private IntegerProperty id_service;
    private IntegerProperty id_hotel;

    public Service_Hotel(int id_service, int id_hotel) {
        this.id_service = new SimpleIntegerProperty(id_service);
        this.id_hotel = new SimpleIntegerProperty(id_hotel);
    }

    public int getId_service() {
        return id_service.get();
    }

    public IntegerProperty id_serviceProperty() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service.set(id_service);
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
