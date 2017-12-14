package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoServiceInterface;
import model.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoService implements DaoServiceInterface {
    @Override
    public ArrayList<Service> getAllService() {
        ArrayList<Service> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM service";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Service service = new Service(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                list.add(service);
            }

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Service getService(int id_Service) {
        return null;
    }

    @Override
    public void updateService(Service service) {

    }

    @Override
    public void deleteService(Service service) {

    }

    @Override
    public void addService(Service service) {

    }
}
