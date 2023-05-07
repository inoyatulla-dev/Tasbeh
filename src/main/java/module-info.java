module com.example.tasbeh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tasbeh to javafx.fxml;
    exports com.example.tasbeh;
}