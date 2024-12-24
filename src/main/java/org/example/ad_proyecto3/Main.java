package org.example.ad_proyecto3;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            // Cargar el archivo FXML de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/ad_proyecto3/Mapas.fxml"));
            Parent root = loader.load();
            //AgentesController agentesController = loader.getController();
            //LoginController loginController = loader.getController();
            //PaquetesController paquetesController = loader.getController();
            MapasController mapasController = loader.getController();
            primaryStage.setTitle("Agentes");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();


        }catch (IOException e) {
            System.err.println("Error loading the FXML file: " + e.getMessage());
        }
    }
}
