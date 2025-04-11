package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.MyObjet;

import java.sql.ResultSet;

public interface Findable <T extends MyObjet>
{
    ResultSet find(String Identifiant);
}
