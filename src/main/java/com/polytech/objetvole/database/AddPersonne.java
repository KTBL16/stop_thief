package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.Personne;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddPersonne
{
    //static DataBaseConnection dbc = new DataBaseConnection();

    public void add(Personne entity)
    {
        String insertsql = " insert into Personne (nom, prenom, email, numTel, adresse) values (?,?,?,?,?)";

        try(PreparedStatement pst = DataBaseConnection.getInstance().getConnection().prepareStatement(insertsql, PreparedStatement.RETURN_GENERATED_KEYS)){
            pst.setString(1,entity.getNom());
            pst.setString(2,entity.getPrenom());
            pst.setString(3,entity.getEmail());
            pst.setString(4,entity.getNumTel());
            pst.setString(5,entity.getAdresse());

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                try(ResultSet generatedkey = pst.getGeneratedKeys()){
                    generatedkey.next();
                    IdPropietaire.setIdPropietaire(generatedkey.getInt(1));
                    System.out.println("succes de l'enregistrement\n votre identifiant unique est:" + IdPropietaire.getIdPropietaire() + "\n");
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

