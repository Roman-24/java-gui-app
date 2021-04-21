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

public class TailorController extends Controller {

    private TailorScene tailorScene;
    private ModelApp modelApp;
    private Tailor tailor;
    private Order order;

    public TailorController(TailorScene tailorScene, ModelApp modelApp) {

        this.tailorScene = tailorScene;
        this.modelApp = modelApp;

        // vykreslenie tailor scény
        tailorScene.getWindow().show();

        // nastavenie akcie pre ShowOrdersButton
        tailorScene.getShowOrdersButton().setOnAction(e -> {
            new ShowOrderScene(new Stage(), modelApp);
        });

        if (modelApp.getTailor() != null) {

            // nájdenie tailora v modelApp
            tailor = modelApp.getTailor();

            // nastavenie akciií pre výrobné tlačítka
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

        // nastavenie akcie pre LogoutButton (odhlásenie a nastavenie login scény)
        tailorScene.getLogoutButton().setOnAction(e -> {
            logOut(tailorScene.getWindow(), modelApp);
        });

    }

    private void hookOrder() {
        int orderNumber = Integer.parseInt(tailorScene.getIncludeOrderNumberInput().getText());
        this.order = modelApp.findOrder(orderNumber);
    }

    public TailorScene getTailorScene() {
        return tailorScene;
    }

    public void setTailorScene(TailorScene tailorScene) {
        this.tailorScene = tailorScene;
    }

    public ModelApp getModelApp() {
        return modelApp;
    }

    public void setModelApp(ModelApp modelApp) {
        this.modelApp = modelApp;
    }

    public Tailor getTailor() {
        return tailor;
    }

    public void setTailor(Tailor tailor) {
        this.tailor = tailor;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}