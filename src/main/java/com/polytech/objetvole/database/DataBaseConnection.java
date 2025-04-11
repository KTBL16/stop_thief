package com.polytech.objetvole.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection
{
    private static DataBaseConnection instance;
    private Connection connection;

    // Configuration de la base de données
    public static final String URL = "jdbc:mysql://localhost:3306/TP2";
    public static  final String USERNAME = "root";
    public static final String PASSWORD = "2004@Lagrange";

    // Constructeur privé
    public DataBaseConnection() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur de connexion à la base de données");
        }
    }

    // Méthode pour obtenir l'instance unique
    public static synchronized DataBaseConnection getInstance() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    // Récupérer la connexion
    public Connection getConnection() {
        try {
            // Vérifier si la connexion est fermée ou nulle, et la recréer si nécessaire
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erreur lors de la vérification ou recréation de la connexion");
        }
        return connection;
    }

   /* // Méthode pour fermer la connexion
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}
