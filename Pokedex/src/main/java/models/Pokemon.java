package models;

import java.util.List;

public class Pokemon {
    private int id;
    private String nom;
    private int niveau;
    private int pdv;
    private int xp;
    private Type type;
    private List<Attaque> attaques;

    //Constructor vide
    public Pokemon(){}

    //Constructor pour afficher les données de la DB
    public Pokemon(int id, String nom, int pdV, int xp, int idType) {
        this.id = id;
        this.nom = nom;
        this.pdv = pdV;
        this.xp = xp;
    }

    //getters pour afficher les différentes informations
    public String getNom() {return nom;}
    public int getNiveau() {return niveau;}
    public int getPdv() {return pdv;}
    public int getXp() {return xp;}
    public Type getType() {return type;}
    public List<Attaque> getAttaques() {return attaques;}

    //Fonction pour associer le type au pokemon grace à l'ID du type
    private Type getTypeById(int idType) {
        switch(idType){
            case 1: return new Eclair();
            case 2: return new Feu();
            case 3: return new Terre();
            case 4: return new Vent();
            case 5: return new Eau();
            default: return null;
        }
    }
}