package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoSeasonInterface;
import model.Season;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoSeason implements DaoSeasonInterface {
    @Override
    public ArrayList<Season> getAllSeason() {

        ArrayList<Season> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM season";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Season season = new Season(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("start_date"),
                        rs.getInt("end_date")
                );

                list.add(season);
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
    public Season getSeason(int id_Season) {
        return null;
    }

    @Override
    public void updateSeason(Season season) {

    }

    @Override
    public void deleteSeason(Season season) {

    }

    @Override
    public void addSeason(Season season) {

    }
}
