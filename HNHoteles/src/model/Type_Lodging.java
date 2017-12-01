package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Type_Lodging {

    private IntegerProperty id;
    private IntegerProperty name;

    public Type_Lodging(int id, int name) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleIntegerProperty(name);
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

    public int getName() {
        return name.get();
    }

    public IntegerProperty nameProperty() {
        return name;
    }

    public void setName(int name) {
        this.name.set(name);
    }
}
