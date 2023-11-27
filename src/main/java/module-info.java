module com.example.crono {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.crono to javafx.fxml;
    exports com.example.crono;
}