module pe.edu.upeu.g1array {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.g1array to javafx.fxml;
    exports pe.edu.upeu.g1array;
}