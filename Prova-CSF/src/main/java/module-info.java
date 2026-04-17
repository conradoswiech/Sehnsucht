module com.mycompany.prova.csf {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.prova.csf to javafx.fxml;
    exports com.mycompany.prova.csf;
}
