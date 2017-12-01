package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Card_Card_Type {

    private IntegerProperty id_card;
    private IntegerProperty id_typeCard;

    public Card_Card_Type(int id_card, int id_typeCard) {
        this.id_card = new SimpleIntegerProperty(id_card);
        this.id_typeCard = new SimpleIntegerProperty(id_typeCard);
    }

    public int getId_card() {
        return id_card.get();
    }

    public IntegerProperty id_cardProperty() {
        return id_card;
    }

    public void setId_card(int id_card) {
        this.id_card.set(id_card);
    }

    public int getId_typeCard() {
        return id_typeCard.get();
    }

    public IntegerProperty id_typeCardProperty() {
        return id_typeCard;
    }

    public void setId_typeCard(int id_typeCard) {
        this.id_typeCard.set(id_typeCard);
    }
}
