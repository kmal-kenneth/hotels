package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoType_LodgingInterface;
import model.Type_Lodging;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoType_Lodging implements DaoType_LodgingInterface {
    @Override
    public ArrayList<Type_Lodging> getAllType_Lodging() {
        ArrayList<Type_Lodging> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM type_lodging";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Type_Lodging type_lodging = new Type_Lodging(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                list.add(type_lodging);
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
    public Type_Lodging getType_Lodging(int id_Type_Lodging) {
        return null;
    }

    @Override
    public void updateType_Lodging(Type_Lodging type_Lodging) {

    }

    @Override
    public void deleteType_Lodging(Type_Lodging type_Lodging) {

    }

    @Override
    public void addType_Lodging(Type_Lodging type_Lodging) {
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `type_lodging` (`id`, `name`) VALUES (NULL, '");
            query.append(type_Lodging.getName());
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
