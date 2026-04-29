package API;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import io.github.cdimascio.dotenv.Dotenv;
import models.Pokemon;

public class ConnexionDB {
    private Connection conn = null;

    //Constructor de la connexion
    public ConnexionDB() {
        final Dotenv dotenv = Dotenv.load();
        try {
            String url = dotenv.get("DB_URL");
            String user = dotenv.get("DB_USER");
            String password = dotenv.get("DB_PASSWORD");

            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Pokemon> GETDB_Pokedex() {
        List<Pokemon> pokedex = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        int i = 0;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Pokemon");
            while (rs.next()) {
                pokedex.add(new Pokemon(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getInt("PdV"),
                        rs.getInt("Xp"),
                        rs.getInt("id_type")
                ));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return pokedex;
    }
}
