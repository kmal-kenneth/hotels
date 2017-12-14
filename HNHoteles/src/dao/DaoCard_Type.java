package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoCard_TypeInterface;
import model.Card_Type;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoCard_Type implements DaoCard_TypeInterface {
    @Override
    public ArrayList<Card_Type> getAllCard_Type() {
        ArrayList<Card_Type> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM card_type";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Card_Type card_type = new Card_Type(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                list.add(card_type);
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
    public Card_Type getCard_Type(int id_card) {
        return null;
    }

    @Override
    public void updateCard_Type(Card_Type card_type) {

    }

    @Override
    public void deleteCard_Type(Card_Type card_type) {

    }

    @Override
    public void addCard_Type(Card_Type card_type) {
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `card_type` (`id`, `name`) VALUES (NULL, '");
            query.append(card_type.getName());
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
