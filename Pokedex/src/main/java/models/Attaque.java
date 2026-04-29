package models;

public class Attaque {
    private String nom;
    private int degats;
    private String effet;
    private Pokemon[] pokemons;

    //Constructor vide
    public Attaque(){}

    //Constructor pour une attaque sans effet supplémentaire
    public Attaque(String nom, int degats){
        this.nom = nom;
        this.degats = degats;
    }

    //Constructor pour une attaque avec effet supplémentaire
    public Attaque(String nom, int degats, String effet){
        this.nom = nom;
        this.degats = degats;
        this.effet = effet;
    }
    //getters pour afficher les différentes informations
    public String getNom() {return nom;}
    public int degats() {return degats;}
    public String effet() {return effet;}
}

