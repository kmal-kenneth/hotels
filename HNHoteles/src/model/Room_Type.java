package model;

import javafx.beans.property.*;

public class Room_Type {

    private IntegerProperty id;
    private StringProperty name;
    private StringProperty bed_type;
    private StringProperty desciption;
    private IntegerProperty number_people;
    private IntegerProperty size;
    private BooleanProperty all_inclusive;
    private BooleanProperty terrace;
    private BooleanProperty seaview;
    private BooleanProperty smoke;

    public Room_Type(int id, String name, String bed_type, String desciption, int number_people, int size, boolean all_inclusive, boolean terrace, boolean seaview, boolean smoke) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.bed_type = new SimpleStringProperty (bed_type);
        this.desciption = new SimpleStringProperty (desciption);
        this.number_people = new SimpleIntegerProperty(number_people);
        this.size = new SimpleIntegerProperty(size);
        this.all_inclusive = new SimpleBooleanProperty(all_inclusive);
        this.terrace = new SimpleBooleanProperty (terrace);
        this.seaview = new SimpleBooleanProperty (seaview);
        this.smoke = new SimpleBooleanProperty (smoke);
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

    public String getBed_type() {
        return bed_type.get();
    }

    public StringProperty bed_typeProperty() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type.set(bed_type);
    }

    public String getDesciption() {
        return desciption.get();
    }

    public StringProperty desciptionProperty() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption.set(desciption);
    }

    public int getNumber_people() {
        return number_people.get();
    }

    public IntegerProperty number_peopleProperty() {
        return number_people;
    }

    public void setNumber_people(int number_people) {
        this.number_people.set(number_people);
    }

    public int getSize() {
        return size.get();
    }

    public IntegerProperty sizeProperty() {
        return size;
    }

    public void setSize(int size) {
        this.size.set(size);
    }

    public boolean isAll_inclusive() {
        return all_inclusive.get();
    }

    public BooleanProperty all_inclusiveProperty() {
        return all_inclusive;
    }

    public void setAll_inclusive(boolean all_inclusive) {
        this.all_inclusive.set(all_inclusive);
    }

    public boolean isTerrace() {
        return terrace.get();
    }

    public BooleanProperty terraceProperty() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace.set(terrace);
    }

    public boolean isSeaview() {
        return seaview.get();
    }

    public BooleanProperty seaviewProperty() {
        return seaview;
    }

    public void setSeaview(boolean seaview) {
        this.seaview.set(seaview);
    }

    public boolean isSmoke() {
        return smoke.get();
    }

    public BooleanProperty smokeProperty() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke.set(smoke);
    }
}
