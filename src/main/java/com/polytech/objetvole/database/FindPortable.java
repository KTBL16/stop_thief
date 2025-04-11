package com.polytech.objetvole.database;

import com.polytech.objetvole.principal.Portable;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindPortable implements Findable<Portable>
{
    static DataBaseConnection dbc = new DataBaseConnection();

    @Override
    public ResultSet find(String Identifiant)
    {
        String selectsql = " select * from Portable where Imei = ?";

        try(PreparedStatement pst = dbc.getInstance().getConnection().prepareStatement(selectsql)){
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
