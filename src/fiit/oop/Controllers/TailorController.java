package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.Core.Order;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.ShowOrderScene;
import fiit.oop.GUI.TailorScene;
import fiit.oop.People.Tailor;
import fiit.oop.People.Worker;
import javafx.stage.Stage;

public class TailorController {

    private TailorScene tailorScene;
    private ModelApp modelApp;
    private ShowOrderScene showOrderScene;
    private Tailor tailor;
    private Order order;

    public TailorController(TailorScene tailorScene, ModelApp modelApp) {

        this.tailorScene = tailorScene;
        this.modelApp = modelApp;

        tailorScene.getWindow().show();

        tailorScene.getShowOrdersButton().setOnAction(e -> {
            showOrderScene = new ShowOrderScene(new Stage(), modelApp);
        });

        if (modelApp.getTailor() != null) {

            tailor = modelApp.getTailor();

            tailorScene.getPrepareTheClothButton().setOnAction(e -> {
                hookOrder();
                tailor.prepareTheCloth(order);
            });

            tailorScene.getMakeRoughVersionButton().setOnAction(e -> {
                hookOrder();
                tailor.makeRoughVersion(order);
            });

            tailorScene.getEarsTopSuitButton().setOnAction(e -> {
                hookOrder();
                tailor.earsTopSuit(order);
            });

            tailorScene.getEarsBottomSuitButton().setOnAction(e -> {
                hookOrder();
                tailor.earsBottomSuit(order);
            });

            tailorScene.getFinalizeSuitButton().setOnAction(e -> {
                hookOrder();
                tailor.finalizeSuit(order);
            });
        }

        tailorScene.getLogoutButton().setOnAction(e -> {
            reLog();
        });

    }

    private void reLog() {

        this.tailorScene.getWindow().close();

        LogInScene logInScene = new LogInScene(new Stage());
        LogInController logInController = new LogInController(logInScene, modelApp);
    }

    private void hookOrder() {
        int orderNumber = Integer.parseInt(tailorScene.getIncludeOrderNumberInput().getText());
        this.order = modelApp.findOrder(orderNumber);
        System.out.println("Objednávka bola nastavená");
    }
}
