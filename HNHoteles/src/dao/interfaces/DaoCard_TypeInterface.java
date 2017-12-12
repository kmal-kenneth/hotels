package dao.interfaces;

import model.Card_Type;

import java.util.ArrayList;

public interface DaoCard_TypeInterface {

    public ArrayList<Card_Type> getCard_Type();
    public Card_Type getCard_Type(int id_card);
    public void updateCard_Type(Card_Type card_type);
    public void deleteCard_Type(Card_Type card_type);
    public void addCard_Type(Card_Type card_type);
}
