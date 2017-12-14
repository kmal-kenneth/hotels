package model;

import javafx.beans.property.*;

public class User {

    private IntegerProperty id;
    private StringProperty name;
    private StringProperty surname;
    private StringProperty gender;
    private IntegerProperty phone;
    private StringProperty email;
    private StringProperty password;
    private BooleanProperty admin;

    public User(int id, String name, String surname, String gender, int phone, String email, String password, Boolean admin) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.gender = new SimpleStringProperty(gender);
        this.phone = new SimpleIntegerProperty(phone);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.admin = new SimpleBooleanProperty(admin);
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

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public String getGender() {
        return gender.get();
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public int getPhone() {
        return phone.get();
    }

    public IntegerProperty phoneProperty() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone.set(phone);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public Boolean getAdmin() {
        return admin.get();
    }

    public BooleanProperty userAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin.set(admin);
    }
}
