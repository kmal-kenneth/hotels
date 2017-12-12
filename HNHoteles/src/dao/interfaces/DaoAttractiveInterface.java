package dao;

import model.Attractive;

import java.util.ArrayList;

public interface DaoAttractiveInterface {

    public ArrayList<Attractive> getAllAttractives();
    public Attractive getAttractive(int id);
    public void updateAttractive(Attractive attractive);
    public void deleteAttractive(Attractive attractive);
    public void addAttractive(Attractive attractive);
}
