package dao.interfaces;

import javafx.collections.ObservableList;
import model.Hotel;

public interface DaoHotelInterface {

    public ObservableList<Hotel> getAllHotel();
    public Hotel getHotel(int id_Hotel);
    public void updateHotel(Hotel hotel);
    public void deleteHotel(Hotel hotel);
    public void addHotel(Hotel hotel);
}
