package fiit.oop.GUI;

import fiit.oop.Core.ModelApp;
import fiit.oop.Core.Order;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ShowOrderScene {

    private Stage window;
    Scene scene;
    // možno vyskúšať...
    // TextArea
    private GridPane grid = new GridPane();
    private ScrollPane scroll = new ScrollPane();

    public ShowOrderScene(Stage primaryStage, ModelApp modelApp) {

        window = primaryStage;
        window.setTitle("Aktuálne objednávky");

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        int row = 0;
        for (Order order : modelApp.orders) {

            Label customerID = new Label("CustomerID: " + order.getCustomerID());
            Label size = new Label("Veľkosť obleku je " + order.getSize());
            Label typeOfSuit = new Label("Typ obleku je: " + order.getTypeOfSuit());
            Label clothMaterial = new Label("Použítý materiál: " + order.getClothMaterial());
            Label design = new Label("Dizajn obleku: " + order.isDesign());
            Label designDescription = new Label("Dizaj je: " + order.getDesignDescription());
            Label condition = new Label("Práce na objednávke sú vo fáze " + order.getCondition());
            Label enter = new Label(" ");

            GridPane.setConstraints(customerID, 0, row++);
            GridPane.setConstraints(size, 0, row++);
            GridPane.setConstraints(typeOfSuit, 0, row++);
            GridPane.setConstraints(clothMaterial, 0, row++);
            GridPane.setConstraints(design, 0, row++);
            GridPane.setConstraints(designDescription, 0, row++);
            GridPane.setConstraints(condition, 0, row++);
            GridPane.setConstraints(enter, 0, row++);

            row++;

            grid.getChildren().addAll(customerID, size, typeOfSuit, clothMaterial, design, designDescription, condition, enter);
        }

        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scroll.setContent(grid);

        scene = new Scene(scroll, 300, 500);
        window.setScene(scene);
        window.show();
    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public ScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(ScrollPane scroll) {
        this.scroll = scroll;
    }
}
