package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMariaDB {

    private static ConnectionMariaDB ourInstance =  new ConnectionMariaDB();;

    private Connection connection;

    private  String user = "root";
    private  String password = "";
    private  String address = "jdbc:mariadb://localhost:3306/hotel";

    private ConnectionMariaDB() {
    }

    public void conect(){
        try {
            this.connection = DriverManager.getConnection(this.address, this.user, this.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconect(){
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionMariaDB getInstance() {
        return ourInstance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
