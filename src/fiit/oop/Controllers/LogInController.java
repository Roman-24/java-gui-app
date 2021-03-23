package fiit.oop.Controllers;

import fiit.oop.Core.App;
import fiit.oop.GUI.LogInScene;

public class LogInController {

    private LogInScene logInScene;
    private App app;

    public LogInController(LogInScene logInScene, App app) {
        this.logInScene = logInScene;
        this.app = app;

        logInScene.getLoginButton().setOnAction(e -> {

            String nameInput = logInScene.getNameInput().getText();
            String passInput = logInScene.getPassInput().getText();

            if(app.checkUser(nameInput, passInput)){
                app.logUser();
                logInScene.getWindow().close();
            }
        });
    }
}
