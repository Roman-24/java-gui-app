package fiit.oop.Controllers;

import fiit.oop.Core.App;
import fiit.oop.GUI.LogInScene;

public class LogInController {

    private LogInScene logInScene;
    private App app;

    public LogInController(LogInScene logInScene, App app) {
        this.logInScene = logInScene;
        this.app = app;

        logInScene.getLoginButton().setOnAction(e ->
                app.checkUser(logInScene.getNameInput().getText(), logInScene.getPassInput().getText())
        );
    }
}
