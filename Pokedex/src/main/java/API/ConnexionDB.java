package API;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import io.github.cdimascio.dotenv.Dotenv;
import models.*;

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
            rs = stmt.executeQuery(
                    "SELECT Pokemon.id, Pokemon.nom, Pokemon.Niveau, Pokemon.PdV, Pokemon.Xp, Type.nom AS nomType " +
                            "FROM Pokemon JOIN Type ON Pokemon.id_type = Type.id"
            );
            while (rs.next()) {
                pokedex.add(new Pokemon(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getInt("Niveau"),
                        rs.getInt("PdV"),
                        rs.getInt("Xp"),
                        getTypeByNom(rs.getString("nomType"))
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
    //Fonction pour afficher en String le nom du type du pokemon
    private Type getTypeByNom(String nomType) {
        switch (nomType.toLowerCase()) {
            case "feu": return new Feu();
            case "eau": return new Eau();
            case "eclair": return new Eclair();
            case "terre": return new Terre();
            case "vent": return new Vent();
            default: return null;
        }
    }
}
