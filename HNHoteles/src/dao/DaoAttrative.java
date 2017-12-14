package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoAttractiveInterface;
import model.Attractive;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoAttrative implements DaoAttractiveInterface {
    @Override
    public ArrayList<Attractive> getAllAttractives() {
        ArrayList<Attractive> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM attractive";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Attractive attractive = new Attractive(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                list.add(attractive);
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
    public Attractive getAttractive(int id) {
        return null;
    }

    @Override
    public void updateAttractive(Attractive attractive) {

    }

    @Override
    public void deleteAttractive(Attractive attractive) {

    }

    @Override
    public void addAttractive(Attractive attractive) {
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `attractive` (`id`, `name`) VALUES (NULL, '");
            query.append(attractive.getName());
            query.append("')");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query.toString());

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
