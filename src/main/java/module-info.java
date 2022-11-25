module comparer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.prefs;


    opens regulator to javafx.fxml;
    opens regulator.controller to javafx.fxml;

    exports regulator;
    exports regulator.controller;
}