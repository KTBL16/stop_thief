package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.MyObjet;
import com.polytech.objetvole.principal.Portable;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddPortable implements Addable<Portable>
{
    //static DataBaseConnection dbc = new DataBaseConnection();

    @Override
    public void add(Portable entity)
    {
        String insertsql = " insert into Portable (Imei, nom, categorie, version, Id_Prop) values (?,?,?,?,?)";

        try(PreparedStatement pst = DataBaseConnection.getInstance().getConnection().prepareStatement(insertsql)){
            pst.setString(1,entity.getImei());
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
