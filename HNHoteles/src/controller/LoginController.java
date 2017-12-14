package controller;

import dao.DaoUser;
import data.GlobalData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.User;

public class LoginController {

    @FXML
    public PasswordField passwordtxtsing;
    @FXML
    public TextField nametxt;
    @FXML
    public TextField surnametxt;
    @FXML
    public RadioButton maleradio;
    @FXML
    public ToggleGroup gender;
    @FXML
    public RadioButton femaleradio;
    @FXML
    public TextField phonetxt;
    @FXML
    public TextField emailtxtsing;
    @FXML
    public PasswordField confirnpasswordtxt;
    @FXML
    private TextField emailtxt;
    @FXML
    private TextField passwordtxt;

    @FXML
    public void login(ActionEvent actionEvent){

        DaoUser daoUser = new DaoUser();

        User user = daoUser.getUserLogin(emailtxt.getText(), passwordtxt.getText());

        if (user != null){

            GlobalData globalData = GlobalData.getInstance();
            globalData.setUserLogin(user);
            System.out.println(globalData.getUserLogin());
        }
    }

    @FXML
    public void singup(ActionEvent actionEvent) {
    }
}
