package dao.interfaces;

import model.Person;

import java.util.ArrayList;

public interface DaoPersonInterface {

    public ArrayList<Person> getAllPersons();
    public Person getPerson(int id);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
    public void addPerson(Person person);
}
