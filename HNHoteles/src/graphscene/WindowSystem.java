package graphscene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WindowSystem {
    private static WindowSystem ourInstance = new WindowSystem();

    private Stage mainStage;
    private Scene mainScene;

    public static String marco = "";
    public static String login = "../view/Login.fxml";

    private WindowSystem() {


    }

    public boolean cargarVentana(String archivoFXML) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(archivoFXML));
            AnchorPane screen = myLoader.load();
            mainScene =  new Scene(screen);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void show() {
        this.mainStage.setScene(mainScene);
        this.mainStage.show();
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;

    }

    public Scene getMainScene() {
        return mainScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public static WindowSystem getInstance() {
        return ourInstance;
    }
}
