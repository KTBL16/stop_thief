package com.polytech.objetvole.service;

import com.polytech.objetvole.principal.MyObjet;

// Service spécifique
public interface IObjetService {
    void declarerObjetVole();
    void estObjetVole(String identifiant);

    //boolean estObjetVole(MyObjet objet);

    void contacterProprietaire(MyObjet objet, String message);
}
