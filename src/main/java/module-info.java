module com.example.sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.antlr.antlr4.runtime;


    opens com.example.sample to javafx.fxml;
    exports com.example.sample;
}