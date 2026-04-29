package models;

public abstract class Type {
    int atk_base;
    int def_base;
    int vit_base;
    int spe_base;

    //getters pour afficher les différentes informations
    public int getAtk_base() {return atk_base;}
    public int getDef_base() {return def_base;}
    public int getVit_base() {return vit_base;}
    public int getSpe_base() {return spe_base;}
}
