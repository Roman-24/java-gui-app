package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.CreateOrderScene;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ManagerScene;
import fiit.oop.GUI.ShowOrderScene;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

import java.util.Observable;

public class ManagerController {

    private ManagerScene managerScene;
    private ModelApp modelApp;

    public ManagerController(ManagerScene managerScene, ModelApp modelApp) {

        this.managerScene = managerScene;
        this.modelApp = modelApp;

        managerScene.getWindow().show();

        managerScene.getOrdersMenu().getItems().get(1).setOnAction(e -> {
            createNewOrder();
        });

        managerScene.getOrdersMenu().getItems().get(0).setOnAction(e -> {
            new ShowOrderScene(new Stage(), modelApp);
        });

        managerScene.getLogoutButton().setOnAction(e -> {
            reLog();
        });

        managerScene.getCheckOrdersButton().setOnAction(e -> {
            managerScene.getOrdersLabel().textProperty().bind(new SimpleStringProperty(
                    "Aktuálny počet objednávok je: " + modelApp.getManager().work()
            ));
        });

        managerScene.getDeletOrderButton().setOnAction(e -> {
            int deletOrderID = Integer.parseInt(managerScene.getDeletOrderField().getText());
            modelApp.getManager().deletOrder(deletOrderID);
        });
    }

    private void createNewOrder(){

        CreateOrderScene createOrderScene = new CreateOrderScene(new Stage(), modelApp);

        createOrderScene.getCreateButton().setOnAction(e -> {

            int customerID = Integer.parseInt(createOrderScene.getCustomerIDInput().getText());
            int size = Integer.parseInt(createOrderScene.getSizeInput().getText());
            String typeOfSuit = createOrderScene.getTypeOfSuitInput().getText();
            String clothMaterial = createOrderScene.getClothMaterialInput().getText();

            modelApp.addOrder(customerID, size, typeOfSuit, clothMaterial);

            createOrderScene.getWindow().close();
        });
    }

    private void reLog(){

        managerScene.getWindow().close();

        LogInScene logInScene = new LogInScene(new Stage());
        LogInController logInController = new LogInController(logInScene, modelApp);
    }
}
