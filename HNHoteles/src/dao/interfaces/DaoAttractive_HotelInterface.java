package dao.interfaces;

import model.Attractive_Hotel;

import java.util.ArrayList;

public interface DaoAttractive_HotelInterface {

    public ArrayList<Attractive_Hotel> getAllAttractive_Hotel();
    public Attractive_Hotel getAttractive_Hotel(int id_hotel);
    public void updateAttractive_Hotel(Attractive_Hotel attractive_hotel);
    public void deleteAttractive_Hotel(Attractive_Hotel attractive_hotel);
    public void addAttractive_Hotel(Attractive_Hotel attractive_hotel);

}
