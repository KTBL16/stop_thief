package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.Ordinateur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindOrdinateur implements Findable<Ordinateur>
{
    //static DataBaseConnection dbc = new DataBaseConnection();

    @Override
    public ResultSet find(String Identifiant) {
        String selectsql = " select * from Ordinateur where adresse_Mac = ?";

        try(PreparedStatement pst = DataBaseConnection.getInstance().getConnection().prepareStatement(selectsql)){
            pst.setString(1,Identifiant);

            try(ResultSet result = pst.executeQuery())
            {
                    return result;
            }catch (SQLException e){
                e.printStackTrace();
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
