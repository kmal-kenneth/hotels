package dao.interfaces;

import model.Service_Hotel;

import java.util.ArrayList;

public interface DaoService_HotelInterface {

    public ArrayList<Service_Hotel> getService_Hotel();
    public Service_Hotel getService_Hotel(int id_Service_Hotel);
    public void updateService_Hotel(Service_Hotel service_Hotel);
    public void deleteService_Hotel(Service_Hotel service_Hotel);
    public void addService_Hotel(Service_Hotel service_Hotel);
}
