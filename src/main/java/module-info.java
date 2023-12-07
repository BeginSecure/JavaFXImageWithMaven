module com.beginsecure.fxmaven {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.beginsecure.fxmaven to javafx.fxml;
    exports com.beginsecure.fxmaven;
}