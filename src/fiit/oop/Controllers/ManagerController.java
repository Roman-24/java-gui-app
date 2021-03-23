package fiit.oop.Controllers;

import fiit.oop.Core.App;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;

public class ManagerController {

    private ManagerScene managerScene;
    private App app;

    public ManagerController(ManagerScene managerScene, App app) {
        this.managerScene = managerScene;
        this.app = app;

        managerScene.getWindow().show();
    }
}
