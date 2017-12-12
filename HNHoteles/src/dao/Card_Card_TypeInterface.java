package dao;

import model.Card_Card_Type;

import java.util.ArrayList;

public interface Card_Card_TypeInterface {

    public ArrayList<Card_Card_Type> getCard_Card_Type();
    public Card_Card_Type getCard_Card_Type(int id_card);
    public void updateCard_Card_Type(Card_Card_Type card_card_type);
    public void deleteCard_Card_Type(Card_Card_Type card_card_type);
    public void addCard_Card_Type(Card_Card_Type card_card_type);
}
