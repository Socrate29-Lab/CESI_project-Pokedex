package com.example.pokedex;

import API.ConnexionDB;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Pokemon;

import java.util.List;

public class PokedexController {
    @FXML
    private Label loadText;
    @FXML
    private TableView<Pokemon> pokedex;
    @FXML
    private TableColumn<Pokemon, String> colNom;
    @FXML
    private TableColumn<Pokemon, Integer> colNiveau;
    @FXML
    private TableColumn<Pokemon, Integer> colPdV;
    @FXML
    private TableColumn<Pokemon, Integer> colXp;


    @FXML
    protected void onLoadDBButtonClick() {
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colNiveau.setCellValueFactory(new PropertyValueFactory<>("niveau"));
        colPdV.setCellValueFactory(new PropertyValueFactory<>("pdv"));
        colXp.setCellValueFactory(new PropertyValueFactory<>("xp"));

        ConnexionDB db = new ConnexionDB();
        List<Pokemon> liste = db.GETDB_Pokedex();

        pokedex.setItems(FXCollections.observableArrayList(liste));
        loadText.setText("Pokédex chargé : " + liste.size() + " Pokémon");
    }
}
