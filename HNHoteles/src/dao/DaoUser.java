package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoUserInterface;
import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoUser implements DaoUserInterface {

    private  User user;

    @Override
    public ArrayList<User> getAllUser() {

        ArrayList<User> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM user";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                User user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("gender"),
                        rs.getInt("phone"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getBoolean("admin")
                );

                list.add(user);
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
    public User getUser(int id_User) {

        return null;
    }

    @Override
    public User getUserLogin(String email, String password) {

        this.user = null;

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("SELECT * FROM user WHERE email = '");
            query.append(email);
            query.append("' AND password = '");
            query.append(password);
            query.append("'");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query.toString());

            while (rs.next()) {

                this.user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("gender"),
                        rs.getInt("phone"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getBoolean("admin")
                );
            }

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return user;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void addUser(User user) {

    }
}
