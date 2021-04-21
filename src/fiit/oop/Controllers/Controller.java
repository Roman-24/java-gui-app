package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.LogInScene;
import javafx.stage.Stage;

public class Controller {

    // metóda zavrie okno a vykreslí logInScene
    protected void logOut(Stage stage, ModelApp modelApp) {
        // zatvor okno
        stage.close();

        // urob novú logInScene
        LogInScene logInScene = new LogInScene(new Stage());
        new LogInController(logInScene, modelApp);
    }
}
