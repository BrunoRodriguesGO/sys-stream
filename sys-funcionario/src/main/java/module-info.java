module com.example.sysfuncionario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sysfuncionario to javafx.fxml;
    exports com.example.sysfuncionario;
    opens com.example.sysfuncionario.controller to javafx.fxml;
}