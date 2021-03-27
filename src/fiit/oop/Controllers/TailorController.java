package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.TailorScene;
import javafx.stage.Stage;

public class TailorController {

    private TailorScene tailorScene;
    private ModelApp modelApp;
    public TailorController(TailorScene tailorScene, ModelApp modelApp) {
        this.tailorScene = tailorScene;
        this.modelApp = modelApp;

        tailorScene.getWindow().show();

        tailorScene.getLogoutButton().setOnAction(e -> {
            reLog();
        });

    }

    private void reLog(){
        System.out.println("Odhlás managera");

        tailorScene.getWindow().close();

        Stage primaryStage = new Stage();
        LogInScene logInScene = new LogInScene(primaryStage);
        LogInController logInController = new LogInController(logInScene, modelApp);
        primaryStage = logInScene.getWindow();
        primaryStage.show();
    }
}
