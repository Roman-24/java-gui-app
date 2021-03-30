package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.LogInScene;

public class LogInController {

    private LogInScene logInScene;
    private ModelApp modelApp;

    public LogInController(LogInScene logInScene, ModelApp modelApp) {

        this.logInScene = logInScene;
        this.modelApp = modelApp;

        logInScene.getLoginButton().setOnAction(e -> {

            String nameInput = logInScene.getNameInput().getText();
            String passInput = logInScene.getPassInput().getText();

            if(modelApp.checkUser(nameInput, passInput)){
                logInScene.getWindow().close();
                modelApp.logUser();
            }
        });
    }
}
