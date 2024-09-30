module Flashcardstudytool {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    // Open the controller package to JavaFX FXML
    opens com.flashcardstudytool.controller to javafx.fxml;

    // Export the main package
    exports com.flashcardstudytool;
}
