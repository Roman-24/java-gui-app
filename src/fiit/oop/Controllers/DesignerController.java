package fiit.oop.Controllers;

import fiit.oop.Core.ModelApp;
import fiit.oop.GUI.DesignerScene;
import fiit.oop.GUI.LogInScene;
import fiit.oop.GUI.ShowOrderScene;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DesignerController {

    Stage window = new Stage();
    GridPane grid = new GridPane();
    BorderPane layout = new BorderPane();
    Scene scene = new Scene(layout, 400,400);

    private DesignerScene designerScene;
    private ModelApp modelApp;
    ShowOrderScene showOrderScene;
    public DesignerController(DesignerScene designerScene, ModelApp modelApp) {
        this.designerScene = designerScene;
        this.modelApp = modelApp;

        designerScene.getWindow().show();

        designerScene.getShowOrdersButton().setOnAction(e -> {
            System.out.println("Zobrazenie objednávok");
            showOrderScene = new ShowOrderScene(new Stage(), modelApp);
        });

        designerScene.getSetDesignButton().setOnAction(e -> {

            int orderNumber = Integer.valueOf(designerScene.getIncludeOrderNumberInput().getText());
            String designDescription =  designerScene.getIncludeYourDesignInput().getText();

            modelApp.findOrderAndSetDesign(orderNumber, designDescription);

            showOrderScene.getWindow().close();

        });

        designerScene.getLogoutButton().setOnAction(e -> {
            reLog();
        });
    }

    private void reLog(){
        System.out.println("Odhlás managera");

        designerScene.getWindow().close();

        Stage primaryStage = new Stage();
        LogInScene logInScene = new LogInScene(primaryStage);
        LogInController logInController = new LogInController(logInScene, modelApp);
        primaryStage = logInScene.getWindow();
        primaryStage.show();
    }
}
