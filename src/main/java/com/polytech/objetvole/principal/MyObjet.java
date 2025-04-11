package com.polytech.objetvole.principal;


public abstract class MyObjet {
    private String nom;
    private String categorie;
    private String version;
    private int Id_Prop; // Référence au propriétaire


    public String getNom()
    {
        return nom;
    }

    public String getCategorie()
    {
        return categorie;
    }

    public String getVersion()
    {
        return version;
    }

    public int getId_Prop()
    {
        return Id_Prop;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setCategorie(String categorie)
    {
        this.categorie = categorie;
    }

    public void setVersion(String version)
    {
        this.version = version;
    }

    public void setId_Prop(int id_Prop) {
        Id_Prop = id_Prop;
    }
}
