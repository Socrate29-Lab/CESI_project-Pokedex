package API;
import java.sql.*;

public class ConnexionDB {
    private Connection conn = null;

    //Constructeur de la connexion
    public ConnexionDB(){
        String url = DB_URL;
        String user = DB_USER;
        String password = DB_PASSWORD;
    }
}
