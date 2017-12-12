package dao;

import model.Hotel;

import java.util.ArrayList;

public interface DaoHotelInterface {

    public ArrayList<Hotel> getHotel();
    public Hotel getHotel(int id_Hotel);
    public void updateHotel(Hotel hotel);
    public void deleteHotel(Hotel hotel);
    public void addHotel(Hotel hotel);
}
