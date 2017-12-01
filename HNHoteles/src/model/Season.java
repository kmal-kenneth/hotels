package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Season {

    private IntegerProperty id;
    private StringProperty name;
    private IntegerProperty start_date;
    private IntegerProperty end_date;

    public Season(int id, String name, int start_date, int end_date) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.start_date = new SimpleIntegerProperty(start_date);
        this.end_date = new SimpleIntegerProperty(end_date);
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

    public int getStart_date() {
        return start_date.get();
    }

    public IntegerProperty start_dateProperty() {
        return start_date;
    }

    public void setStart_date(int start_date) {
        this.start_date.set(start_date);
    }

    public int getEnd_date() {
        return end_date.get();
    }

    public IntegerProperty end_dateProperty() {
        return end_date;
    }

    public void setEnd_date(int end_date) {
        this.end_date.set(end_date);
    }
}
