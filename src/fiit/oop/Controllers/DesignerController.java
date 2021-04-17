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

    private Stage window = new Stage();
    private GridPane grid = new GridPane();
    private BorderPane layout = new BorderPane();
    private Scene scene = new Scene(layout, 400,400);
    private DesignerScene designerScene;
    private ModelApp modelApp;
    private ShowOrderScene showOrderScene;

    public DesignerController(DesignerScene designerScene, ModelApp modelApp) {

        this.designerScene = designerScene;
        this.modelApp = modelApp;

        designerScene.getWindow().show();

        designerScene.getShowOrdersButton().setOnAction(e -> {
            showOrderScene = new ShowOrderScene(new Stage(), modelApp);
        });

        designerScene.getSetDesignButton().setOnAction(e -> {

            int orderNumber = Integer.parseInt(designerScene.getIncludeOrderNumberInput().getText());
            String designDescription =  designerScene.getIncludeYourDesignInput().getText();

            modelApp.findOrderAndSetDesign(orderNumber, designDescription);

            if(showOrderScene != null)
                showOrderScene.getWindow().close();

        });

        designerScene.getLogoutButton().setOnAction(e -> {
            reLog();
        });
    }

    private void reLog(){

        designerScene.getWindow().close();

        LogInScene logInScene = new LogInScene(new Stage());
        LogInController logInController = new LogInController(logInScene, modelApp);
    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public BorderPane getLayout() {
        return layout;
    }

    public void setLayout(BorderPane layout) {
        this.layout = layout;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public DesignerScene getDesignerScene() {
        return designerScene;
    }

    public void setDesignerScene(DesignerScene designerScene) {
        this.designerScene = designerScene;
    }

    public ModelApp getModelApp() {
        return modelApp;
    }

    public void setModelApp(ModelApp modelApp) {
        this.modelApp = modelApp;
    }

    public ShowOrderScene getShowOrderScene() {
        return showOrderScene;
    }

    public void setShowOrderScene(ShowOrderScene showOrderScene) {
        this.showOrderScene = showOrderScene;
    }
}
