package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoImageInterface;
import model.Image;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoImage implements DaoImageInterface {
    @Override
    public ArrayList<Image> getAllImage() {
        ArrayList<Image> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM image";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Image image = new Image(
                        rs.getInt("id"),
                        rs.getInt("id_hotel")

                );

                list.add(image);
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
    public Image getImage(int id_Image) {
        return null;
    }

    @Override
    public void deleteImage(Image image) {

    }

    @Override
    public void updateImage(Image image) {

    }

    @Override
    public void addImage(Image image) {
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `image` (`id`, `id_hotel`, `photography`) VALUES (NULL, '");
            query.append(image.getId_hotel());

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
