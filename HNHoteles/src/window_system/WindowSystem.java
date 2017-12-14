package window_system;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.security.acl.Group;

public class WindowSystem {
    private static WindowSystem ourInstance = new WindowSystem();

    public static String marco = "frame.fxml";
    public static String ventana1 = "principal.fxml";
    public static String ventana2 = "secundaria.fxml";
    private Stage mainStage;
    private Group mainScene;

    private WindowSystem() {
    }



    public static WindowSystem getInstance() {
        return ourInstance;
    }
}
