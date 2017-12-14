package data;

import model.User;

public class GlobalData {
    private static GlobalData ourInstance = new GlobalData();

    private User userLogin;

    private GlobalData() {
    }

    public User getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(User userLogin) {
        this.userLogin = userLogin;
    }

    public static GlobalData getInstance() {
        return ourInstance;
    }
}
