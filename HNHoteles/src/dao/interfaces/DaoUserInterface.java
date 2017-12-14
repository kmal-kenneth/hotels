package dao.interfaces;

import model.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoUserInterface {
    public ArrayList<User> getAllUser();
    public User getUser(int id_User);
    public void updateUser(User user);
    public void deleteUser(User user);
    public void addUser(User user);
}
