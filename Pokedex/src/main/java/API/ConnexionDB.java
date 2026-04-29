package API;
import java.sql.*;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnexionDB {
    private Connection conn = null;

    //Constructeur de la connexion
    public ConnexionDB(){
        //Pour utiliser le .env
        final Dotenv dotenv = Dotenv.load();

        String url = dotenv.get("DB_URL");
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASSWORD");
    }
}
