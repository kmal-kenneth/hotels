package dao;

import model.Card;

import java.util.ArrayList;

public interface DaoCardInterface {

    public ArrayList<Card> getCards();
    public Card getCard(int id);
    public void updateCard(Card card);
    public void deleteCard(Card card);
    public void addCard(Card card);
}
