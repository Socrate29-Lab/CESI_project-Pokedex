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

    //Constructor avec toutes les données
    public Pokemon(String nom, int niveau, int pdv, int xp, Type type, List<Attaque> attaques) {
        this.nom = nom;
        this.niveau = niveau;
        this.pdv = pdv;
        this.xp = xp;
        this.type = type;
        this.attaques = attaques;
    }
    //getters pour afficher les différentes informations
    public int getId() {return id;}
    public String getNom() {return nom;}
    public int getNiveau() {return niveau;}
    public int getPdv() {return pdv;}
    public int getXp() {return xp;}
    public Type getType() {return type;}
    public List<Attaque> getAttaques() {return attaques;}

}