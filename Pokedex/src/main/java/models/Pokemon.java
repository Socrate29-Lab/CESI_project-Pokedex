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
    public Pokemon(int id, String nom,int niveau, int pdV, int xp, Type type) {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
        this.pdv = pdV;
        this.xp = xp;
        this.type = type;
    }

    //getters pour afficher les différentes informations
    public String getNom() {return nom;}
    public int getNiveau() {return niveau;}
    public int getPdv() {return pdv;}
    public int getXp() {return xp;}
    public Type getType() {return type;}
    public List<Attaque> getAttaques() {return attaques;}


}