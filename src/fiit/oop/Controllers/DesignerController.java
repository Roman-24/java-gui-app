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

public class DesignerController extends Controller {

    private Stage window = new Stage();
    private GridPane grid = new GridPane();
    private BorderPane layout = new BorderPane();
    private Scene scene = new Scene(layout, 400, 400);
    private DesignerScene designerScene;
    private ModelApp modelApp;
    private ShowOrderScene showOrderScene;

    public DesignerController(DesignerScene designerScene, ModelApp modelApp) {

        this.designerScene = designerScene;
        this.modelApp = modelApp;

        // vykreslenie dizajner scény
        designerScene.getWindow().show();

        // Nastavenie akcie pre ShowOrdersButton
        designerScene.getShowOrdersButton().setOnAction(e -> {
            showOrderScene = new ShowOrderScene(new Stage(), modelApp);
        });

        // Nastavenie akcie pre SetDesignButton
        designerScene.getSetDesignButton().setOnAction(e -> {

            // načíta sa zadané ID objednávky
            int orderNumber = Integer.parseInt(designerScene.getIncludeOrderNumberInput().getText());
            String designDescription = designerScene.getIncludeYourDesignInput().getText();

            // vyhľadá sa príslušná objednávka a tej sa priradí zadaný dizajn
            modelApp.findOrderAndSetDesign(orderNumber, designDescription);

            // zatvorenie okna s objednávkami
            if (showOrderScene != null)
                showOrderScene.getWindow().close();
        });

        // nastavenie akcie pre LogoutButton (odhlásenie a nastavenie login scény)
        designerScene.getLogoutButton().setOnAction(e -> {
            logOut(designerScene.getWindow(), modelApp);
        });
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
