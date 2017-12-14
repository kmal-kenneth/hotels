package dao;

import conection.ConnectionMariaDB;
import dao.interfaces.DaoPersonInterface;
import model.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoPerson implements DaoPersonInterface {
    @Override
    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> list = new ArrayList<>();

        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            String query = "SELECT * FROM person";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Person person = new Person(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname")
                );

                list.add(person);
            }

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Person getPerson(int id) {
        return null;
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(Person person) {

    }

    @Override
    public void addPerson(Person person) {
        try {
            ConnectionMariaDB connectionMariaDB = ConnectionMariaDB.getInstance();
            connectionMariaDB.conect();

            Connection connection = connectionMariaDB.getConnection();

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO `person` (`id`, `name`, `surname`) VALUES (NULL, '");
            query.append(person.getName());
            query.append("', '");
            query.append(person.getSurname());
            query.append("')");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query.toString());

            st.close();
            connectionMariaDB.disconect();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }
}
