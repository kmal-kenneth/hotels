package model;

import javafx.beans.property.*;

public class Hotel {

    private IntegerProperty id;
    private IntegerProperty number_phone;
    private IntegerProperty foundation_year;
    private IntegerProperty id_typeLodging;
    private IntegerProperty hotel_size;
    private StringProperty name;
    private StringProperty address;
    private StringProperty country;
    private IntegerProperty check_in;
    private IntegerProperty check_out;
    private StringProperty requirements;
    private IntegerProperty stars;

    public Hotel(int id, int number_phone, int foundation_year, int id_typeLodging, int hotel_size, String name, String address, String country, int check_in, int check_out, String requirements, int stars) {
        this.id = new SimpleIntegerProperty(id);
        this.number_phone = new SimpleIntegerProperty (number_phone);
        this.foundation_year = new SimpleIntegerProperty (foundation_year);
        this.id_typeLodging = new SimpleIntegerProperty (id_typeLodging);
        this.hotel_size = new SimpleIntegerProperty(hotel_size);
        this.name = new SimpleStringProperty(name);
        this.address = new SimpleStringProperty (address);
        this.country = new SimpleStringProperty (country);
        this.check_in = new SimpleIntegerProperty(check_in);
        this.check_out = new SimpleIntegerProperty (check_out);
        this.requirements = new SimpleStringProperty (requirements);
        this.stars = new SimpleIntegerProperty (stars);
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

    public int getNumber_phone() {
        return number_phone.get();
    }

    public IntegerProperty number_phoneProperty() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
        this.number_phone.set(number_phone);
    }

    public int getFoundation_year() {
        return foundation_year.get();
    }

    public IntegerProperty foundation_yearProperty() {
        return foundation_year;
    }

    public void setFoundation_year(int foundation_year) {
        this.foundation_year.set(foundation_year);
    }

    public int getId_typeLodging() {
        return id_typeLodging.get();
    }

    public IntegerProperty id_typeLodgingProperty() {
        return id_typeLodging;
    }

    public void setId_typeLodging(int id_typeLodging) {
        this.id_typeLodging.set(id_typeLodging);
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

    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getCountry() {
        return country.get();
    }

    public StringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public int getCheck_in() {
        return check_in.get();
    }

    public IntegerProperty check_inProperty() {
        return check_in;
    }

    public void setCheck_in(int check_in) {
        this.check_in.set(check_in);
    }

    public int getCheck_out() {
        return check_out.get();
    }

    public IntegerProperty check_outProperty() {
        return check_out;
    }

    public void setCheck_out(int check_out) {
        this.check_out.set(check_out);
    }

    public String getRequirements() {
        return requirements.get();
    }

    public StringProperty requirementsProperty() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements.set(requirements);
    }

    public int getStars() {
        return stars.get();
    }

    public IntegerProperty starsProperty() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars.set(stars);
    }

    public int getHotel_size() {
        return hotel_size.get();
    }

    public IntegerProperty hotel_sizeProperty() {
        return hotel_size;
    }

    public void setHotel_size(int hotel_size) {
        this.hotel_size.set(hotel_size);
    }
}
