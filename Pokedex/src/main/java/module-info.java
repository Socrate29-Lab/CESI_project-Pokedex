module com.example.pokedex {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires io.github.cdimascio.dotenv.java;



    opens com.example.pokedex to javafx.fxml;
    opens models to javafx.base;
    exports com.example.pokedex;
}