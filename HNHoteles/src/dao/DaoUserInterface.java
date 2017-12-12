package dao;

import model.User;

import java.util.ArrayList;

public interface DaoUserInterface {
    public ArrayList<User> getUser();
    public User getUser(int id_User);
    public void updateUser(User user);
    public void deleteUser(User user);
    public void addUser(User user);
}
