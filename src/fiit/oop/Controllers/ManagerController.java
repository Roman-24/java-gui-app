package fiit.oop.Controllers;

import fiit.oop.Core.App;
import fiit.oop.Core.Order;
import fiit.oop.GUI.CreateOrderScene;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;
import javafx.stage.Stage;

public class ManagerController {

    private ManagerScene managerScene;
    private App app;

    public ManagerController(ManagerScene managerScene, App app) {
        this.managerScene = managerScene;
        this.app = app;

        managerScene.getWindow().show();

        managerScene.getMenuBar().ge.setOnAction(e ->
                System.out.println("Požiadavka na vytvorenie novej objednávky")
                // new CreateOrderScene(new Stage(), app)
        );
    }
}
