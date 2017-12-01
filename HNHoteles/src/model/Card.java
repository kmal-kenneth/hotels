package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Card {

    private IntegerProperty id;
    private IntegerProperty id_user;
    private StringProperty name_holder;
    private StringProperty surname_holder;
    private IntegerProperty card_number;
    private IntegerProperty security_code;
    private IntegerProperty month_expiration;
    private IntegerProperty year_expiration;

    public Card(int id, int id_user, String name_holder, String surname_holder, int card_number, int security_code, int month_expiration, int year_expiration) {
        this.id = new SimpleIntegerProperty(id);
        this.id_user = new SimpleIntegerProperty (id_user);
        this.name_holder = new SimpleStringProperty(name_holder);
        this.surname_holder = new SimpleStringProperty(surname_holder);
        this.card_number = new SimpleIntegerProperty(card_number);
        this.security_code = new SimpleIntegerProperty(security_code);
        this.month_expiration = new SimpleIntegerProperty(month_expiration);
        this.year_expiration = new SimpleIntegerProperty(year_expiration);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getId_user() {
        return id_user.get();
    }

    public IntegerProperty id_userProperty() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user.set(id_user);
    }

    public String getName_holder() {
        return name_holder.get();
    }

    public StringProperty name_holderProperty() {
        return name_holder;
    }

    public void setName_holder(String name_holder) {
        this.name_holder.set(name_holder);
    }

    public String getSurname_holder() {
        return surname_holder.get();
    }

    public StringProperty surname_holderProperty() {
        return surname_holder;
    }

    public void setSurname_holder(String surname_holder) {
        this.surname_holder.set(surname_holder);
    }

    public int getCard_number() {
        return card_number.get();
    }

    public IntegerProperty card_numberProperty() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number.set(card_number);
    }

    public int getSecurity_code() {
        return security_code.get();
    }

    public IntegerProperty security_codeProperty() {
        return security_code;
    }

    public void setSecurity_code(int security_code) {
        this.security_code.set(security_code);
    }

    public int getMonth_expiration() {
        return month_expiration.get();
    }

    public IntegerProperty month_expirationProperty() {
        return month_expiration;
    }

    public void setMonth_expiration(int month_expiration) {
        this.month_expiration.set(month_expiration);
    }

    public int getYear_expiration() {
        return year_expiration.get();
    }

    public IntegerProperty year_expirationProperty() {
        return year_expiration;
    }

    public void setYear_expiration(int year_expiration) {
        this.year_expiration.set(year_expiration);
    }
}
