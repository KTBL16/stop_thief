package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.MyObjet;

public interface Addable <T extends MyObjet>
{
    void add(T entity);
}
