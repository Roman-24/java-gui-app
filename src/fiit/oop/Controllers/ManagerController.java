package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.CreateOrderScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.ShowOrderScene;
import fiit.oop.Storage.Cloth;
import javafx.stage.Stage;

public class ManagerController {

    private ManagerScene managerScene;
    private ModelApp modelApp;

    public ManagerController(ManagerScene managerScene, ModelApp modelApp) {
        this.managerScene = managerScene;
        this.modelApp = modelApp;

        managerScene.getWindow().show();

        managerScene.getOrdersMenu().getItems().get(1).setOnAction(e -> {

            System.out.println("Požiadavka na vytvorenie novej objednávky");
            createNewOrder();
        });

        managerScene.getOrdersMenu().getItems().get(0).setOnAction(e -> {
            System.out.println("Zobrazenie objednávok");
            new ShowOrderScene(new Stage(), modelApp);
        });
    }

    private void createNewOrder(){
        CreateOrderScene createOrderScene = new CreateOrderScene(new Stage(), modelApp);

        createOrderScene.getCreateButton().setOnAction(e -> {

            int customerID = Integer.valueOf(createOrderScene.getCustomerIDInput().getText());
            int size = Integer.valueOf(createOrderScene.getSizeInput().getText());
            String typeOfSuit = createOrderScene.getTypeOfSuitInput().getText();
            String clothMaterial = createOrderScene.getClothMaterialInput().getText();

            modelApp.addOrder(customerID, size, typeOfSuit, clothMaterial);

            System.out.println("createNewOrder bolo uskutočnené");
            createOrderScene.getWindow().close();

        });
    }
}
