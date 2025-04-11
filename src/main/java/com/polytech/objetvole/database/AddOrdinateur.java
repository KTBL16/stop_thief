package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.Ordinateur;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddOrdinateur implements Addable<Ordinateur>
{
    @Override
    public void add(Ordinateur entity) {
        String insertsql = " insert into Ordinateur (adresse_Mac, nom, categorie, version, Id_Prop) values (?,?,?,?,?)";

        try(PreparedStatement pst = DataBaseConnection.getInstance().getConnection().prepareStatement(insertsql)){
            pst.setString(1,entity.getAdresse_Mac());
            pst.setString(2,entity.getNom());
            pst.setString(3,entity.getCategorie());
            pst.setString(4,entity.getVersion());
            pst.setInt(5,IdPropietaire.getIdPropietaire());

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                    System.out.println("succes de l'enregistrement\n");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
