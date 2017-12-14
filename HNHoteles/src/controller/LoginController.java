package controller;

import dao.DaoUser;
import data.GlobalData;
import graphscene.WindowSystem;
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
    public void login(ActionEvent actionEvent) {

        DaoUser daoUser = new DaoUser();

        User user = daoUser.getUserLogin(emailtxt.getText(), passwordtxt.getText());

        if (user != null) {

            GlobalData globalData = GlobalData.getInstance();
            globalData.setUserLogin(user);
            WindowSystem windowSystem = WindowSystem.getInstance();
            windowSystem.cargarVentana(windowSystem.adminHotels);
            windowSystem.show();
        }
    }

    @FXML
    public void singup(ActionEvent actionEvent) {

        maleradio.setUserData("Male");
        femaleradio.setUserData("Female");

        if (!nametxt.getText().equals("")) {
            if (!surnametxt.getText().equals("")) {
                if (!phonetxt.getText().equals("")) {
                    if (!emailtxtsing.getText().equals("")) {
                        if (!passwordtxtsing.getText().equals("")) {
                            if (!confirnpasswordtxt.getText().equals("")) {
                                if (confirnpasswordtxt.getText().equals(passwordtxtsing.getText())) {

                                    User user = new User(
                                            0,
                                            nametxt.getText(),
                                            surnametxt.getText(),
                                            gender.getSelectedToggle().getUserData().toString(),
                                            Integer.parseInt(phonetxt.getText()),
                                            emailtxtsing.getText(),
                                            passwordtxtsing.getText(),
                                            false
                                    );

                                    DaoUser daoUser = new DaoUser();
                                    daoUser.addUser(user);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


