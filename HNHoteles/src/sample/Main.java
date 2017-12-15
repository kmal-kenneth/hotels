package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import graphscene.WindowSystem;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        WindowSystem windowSystem = WindowSystem.getInstance();

        windowSystem.setMainStage(primaryStage);
        windowSystem.cargarVentana(windowSystem.adminHotels);
        windowSystem.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
