module com.example.pokedex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pokedex to javafx.fxml;
    exports com.example.pokedex;
}