package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.CreateOrderScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.ShowOrderScene;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

public class ManagerController extends Controller {

    private ManagerScene managerScene;
    private ModelApp modelApp;

    public ManagerController(ManagerScene managerScene, ModelApp modelApp) {

        this.managerScene = managerScene;
        this.modelApp = modelApp;

        // vykreslenie manager scény
        managerScene.getWindow().show();

        // nastavenie akcie pre položku (vytvorenie novej objednávky) v menu
        managerScene.getOrdersMenu().getItems().get(1).setOnAction(e -> {
            createNewOrder();
        });

        // nastavenie akcie pre položku (zobraziť objednávky) v menu
        managerScene.getOrdersMenu().getItems().get(0).setOnAction(e -> {
            new ShowOrderScene(new Stage(), modelApp);
        });

        // nastavenie akcie pre CheckOrdersButton
        managerScene.getCheckOrdersButton().setOnAction(e -> {

            // prepísanie príslušného Labelu
            managerScene.getOrdersLabel().textProperty().bind(new SimpleStringProperty(
                    "Aktuálny počet objednávok je: " + modelApp.getManager().work()
            ));
        });

        // Nastavenie akcie pre DeletOrderButton
        managerScene.getDeletOrderButton().setOnAction(e -> {

            // naskenovanie ID objednávky kt. sa má vymazať
            int deletOrderID = Integer.parseInt(managerScene.getDeletOrderField().getText());

            //vymazanie príslušnej objednávky
            modelApp.getManager().deletOrder(deletOrderID);
        });

        // nastavenie akcie pre LogoutButton (odhlásenie a nastavenie login scény)
        managerScene.getLogoutButton().setOnAction(e -> {
            logOut(managerScene.getWindow(), modelApp);
        });
    }

    // metóda pre vytvorenie novej objednávky
    private void createNewOrder() {

        // scéna pre novú objednávku
        CreateOrderScene createOrderScene = new CreateOrderScene(new Stage(), modelApp);

        // nastavenie akcie pre CreateOrderButton
        createOrderScene.getCreateOrderButton().setOnAction(e -> {

            // načítanie vstupov
            int customerID = Integer.parseInt(createOrderScene.getCustomerIDInput().getText());
            int size = Integer.parseInt(createOrderScene.getSizeInput().getText());
            String typeOfSuit = createOrderScene.getTypeOfSuitInput().getText();
            String clothMaterial = createOrderScene.getClothMaterialInput().getText();

            // pridanie odjednávky do zoznamu objednávok
            modelApp.addOrder(customerID, size, typeOfSuit, clothMaterial);

            // zatvorenie okna pre tvorbu novej objednávky
            createOrderScene.getWindow().close();
        });
    }

}