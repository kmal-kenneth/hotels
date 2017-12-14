package graphscene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class WindowSystem {
    private static WindowSystem ourInstance = new WindowSystem();

    private Stage mainStage;
    private Group mainScene;

    public static String marco = "";
    public static String login = "../view/Login.fxml";

    private WindowSystem() {
        Group root = new Group();
        this.mainScene = root;
    }

    public boolean cargarVentana(String archivoFXML) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(archivoFXML));
            AnchorPane screen = myLoader.load();
            if (marco.equals(archivoFXML) || mainScene.getChildren().isEmpty()) {
                mainScene.getChildren().add(screen);
            } else {
                mainScene.getChildren().remove(0);
                mainScene.getChildren().add(0, screen);
            }

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void show() {

        Scene scene = new Scene(this.mainScene);
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;

    }

    public Group getMainScene() {
        return mainScene;
    }

    public void setMainScene(Group mainScene) {
        this.mainScene = mainScene;
    }

    public static WindowSystem getInstance() {
        return ourInstance;
    }
}
