module com.polytech.objetvole {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

//    requires org.controlsfx.controls;
 //   requires org.kordamp.bootstrapfx.core;

    opens com.polytech.objetvole to javafx.fxml;
    exports com.polytech.objetvole;
    exports com.polytech.objetvole.principal;
    opens com.polytech.objetvole.principal to javafx.fxml;
    exports com.polytech.objetvole.database;
    opens com.polytech.objetvole.database to javafx.fxml;
    exports com.polytech.objetvole.service;
    opens com.polytech.objetvole.service to javafx.fxml;
}