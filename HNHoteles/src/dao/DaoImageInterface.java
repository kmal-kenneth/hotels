package dao;

import model.Image;

import java.util.ArrayList;

public interface DaoImageInterface {

    public ArrayList<Image> getImage();
    public Image getImage(int id_Image);
    public void deleteImage(Image image);
    public void updateImage(Image image);
    public void addImage(Image image);
}
