package dao.interfaces;

import model.Season;

import java.util.ArrayList;

public interface DaoSeasonInterface {
    public ArrayList<Season> getAllSeason();
    public Season getSeason(int id_Season);
    public void updateSeason(Season season);
    public void deleteSeason(Season season);
    public void addSeason(Season season);
}
