package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoCardInterface;
import model.Card;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoCard implements DaoCardInterface {
    @Override
    public ArrayList<Card> getAllCards() {
        ArrayList<Card> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM card";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Card card = new Card(
                        rs.getInt("id"),
                        rs.getInt("id_user"),
                        rs.getString("name_holder"),
                        rs.getString("surname_holder"),
                        rs.getInt("card_number"),
                        rs.getInt("security_code"),
                        rs.getInt("month_expiration"),
                        rs.getInt("year_expiration")
                );

                list.add(card);
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
    public Card getCard(int id) {
        return null;
    }

    @Override
    public void updateCard(Card card) {

    }

    @Override
    public void deleteCard(Card card) {

    }

    @Override
    public void addCard(Card card) {

    }
}
