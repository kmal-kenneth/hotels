package controller;

import dao.DaoHotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Callback;
import model.Attractive;
import model.Hotel;
import model.Service;
import model.Type_Lodging;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminHotelsController implements Initializable {

    @FXML
    private ToggleButton start1;

    @FXML
    private Button addHotels;

    @FXML
    private Button updateHotels;

    @FXML
    private ListView<Attractive> attractiveListView;

    @FXML
    private TextField sicetxt;

    @FXML
    private TextField checkintxt;

    @FXML
    private ListView<Type_Lodging> lodgingListView;

    @FXML
    private TextField checkouttxt;

    @FXML
    private TextField addresstxt;

    @FXML
    private ToggleButton start3;

    @FXML
    private TextField coutrytxt;

    @FXML
    private ToggleButton start2;

    @FXML
    private ToggleButton start5;

    @FXML
    private ToggleButton start4;

    @FXML
    private TextArea requirementstxt;

    @FXML
    private TextField nametxt;

    @FXML
    private ToggleGroup start;

    @FXML
    private ListView<Service> serviceListView;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField servicetxt;

    @FXML
    private Button deleteHotels;

    @FXML
    private ListView<Hotel> hotelsListView;

    @FXML
    private TextField phonetxt;

    @FXML
    private TextField attractivetxt;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private TextField lodgingtxt;

    private ObservableList<Hotel> hoteList;


    @FXML
    void addLodging(ActionEvent event) {

    }

    @FXML
    void updatelodging(ActionEvent event) {

    }

    @FXML
    void deletelLdging(ActionEvent event) {

    }

    @FXML
    void addService(ActionEvent event) {

    }

    @FXML
    void updateService(ActionEvent event) {

    }

    @FXML
    void deleteService(ActionEvent event) {

    }

    @FXML
    void addAttractive(ActionEvent event) {

    }

    @FXML
    void updateAttractive(ActionEvent event) {

    }

    @FXML
    void deleteAttractive(ActionEvent event) {

    }

    @FXML
    void showHotels(ActionEvent event) {

    }

    @FXML
    void showRooms(ActionEvent event) {

    }

    @FXML
    void showResrvation(ActionEvent event) {

    }

    @FXML
    void refreshHotels(ActionEvent actionEvent) {

        DaoHotel daoHotel = new DaoHotel();

        hoteList.clear();
        hoteList.addAll(daoHotel.getAllHotel());
        hotelsListView.setItems(hoteList);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        hoteList = FXCollections.observableArrayList();

        costomCell();
//        refreshHotels(new ActionEvent());

    }

    private void costomCell() {

        hotelsListView.setCellFactory(new Callback<ListView<Hotel>, ListCell<Hotel>>() {

            @Override
            public ListCell<Hotel> call(ListView<Hotel> list) {
                return new ListCell<Hotel>() {

                    @Override
                    protected void updateItem(Hotel item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) {

                            Label name = new Label(item.getName());
                            Label country = new Label("Country: " + item.getCountry());
                            Label address = new Label("Address: " + item.getAddress());
                            Label phone = new Label("Phone: " + String.valueOf(item.getNumber_phone()));
                            Label rate = new Label("Rate: " + String.valueOf(item.getStars()));

                            VBox itemView = new VBox(10, name, country, address, phone, rate);
                            setGraphic(itemView);
                        } else {

                            setGraphic(null);
                        }
                    }

                };
            }

        });
    }
}
