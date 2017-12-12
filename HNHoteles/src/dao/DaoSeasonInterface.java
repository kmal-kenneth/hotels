package dao;

import model.Season;

import java.util.ArrayList;

public interface DaoSeasonInterface {
    public ArrayList<Season> getSeason();
    public Season getSeason(int id_Season);
    public void updateSeason(Season season);
    public void deleteSeason(Season season);
    public void addSeason(Season season);
}
