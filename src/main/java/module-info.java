module com.example.blindtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.blindtest to javafx.fxml;
    exports com.example.blindtest;
}