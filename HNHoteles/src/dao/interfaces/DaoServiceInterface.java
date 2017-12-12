package dao.interfaces;

import model.Service;

import java.util.ArrayList;

public interface DaoServiceInterface {

    public ArrayList<Service> getService();
    public Service getService(int id_Service);
    public void updateService(Service service);
    public void deleteService(Service service);
    public void addService(Service service);
}
