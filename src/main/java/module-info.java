module org.example.ad_proyecto3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ad_proyecto3 to javafx.fxml;
    exports org.example.ad_proyecto3;
}