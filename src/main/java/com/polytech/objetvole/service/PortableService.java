package com.polytech.objetvole.service;

import com.polytech.objetvole.database.*;
import com.polytech.objetvole.principal.MyObjet;
import com.polytech.objetvole.principal.Personne;
import com.polytech.objetvole.principal.Portable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PortableService implements IObjetService
{
    AddPersonne ADDP = new AddPersonne();
    AddPortable ADDPO = new AddPortable();
    FindPortable FIND = new FindPortable();
    Personne proprietaire = new Personne();
    Portable portable = new Portable();
    Scanner input = new Scanner(System.in);

    @Override
    public void declarerObjetVole()
    {
        System.out.println("information de l'utilisateur(nom, prenomn email, numtel et adresse)");
        proprietaire.setNom(input.nextLine());
        proprietaire.setPrenom(input.nextLine());
        proprietaire.setEmail(input.nextLine());
        proprietaire.setNumTel(input.nextLine());
        proprietaire.setAdresse(input.nextLine());

        ADDP.add(proprietaire);

        System.out.println("information du portable(imei, nom, catégorie, version");
        portable.setImei(input.nextLine());
        portable.setNom(input.nextLine());
        portable.setCategorie(input.nextLine());
        portable.setVersion(input.nextLine());

        ADDPO.add(portable);

    }

    @Override
    public void estObjetVole(String identifiant) {
        System.out.println("identifiant de l'objet");
        identifiant = input.nextLine();
        try(ResultSet resultat = FIND.find(identifiant)){
            resultat.next();
            if (resultat == null)
            {
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void contacterProprietaire(MyObjet objet, String message) {
        System.out.println("oui oui");

    }
}
