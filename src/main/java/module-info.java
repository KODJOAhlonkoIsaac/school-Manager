module com.app.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.app.schoolmanager to javafx.fxml;
    exports com.app.schoolmanager;

    opens com.app.schoolmanager.Controller to javafx.fxml;
    exports com.app.schoolmanager.Controller;

    opens com.app.schoolmanager.models to javafx.fxml;
    exports com.app.schoolmanager.models;

    opens com.app.schoolmanager.Interface to javafx.fxml;
    exports com.app.schoolmanager.Interface;

    opens com.app.schoolmanager.DBconfig to javafx.fxml;
    exports com.app.schoolmanager.DBconfig;

 }