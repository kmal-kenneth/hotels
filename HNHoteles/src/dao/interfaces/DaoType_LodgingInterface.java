package dao.interfaces;

import model.Type_Lodging;

import java.util.ArrayList;

public interface DaoType_LodgingInterface {
    public ArrayList<Type_Lodging> getType_Lodging();
    public Type_Lodging getType_Lodging(int id_Type_Lodging);
    public void updateType_Lodging(Type_Lodging type_Lodging);
    public void deleteType_Lodging(Type_Lodging type_Lodging);
    public void addType_Lodging(Type_Lodging type_Lodging);
}
