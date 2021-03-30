package fiit.oop.GUI;

import fiit.oop.Core.ModelApp;
import fiit.oop.Core.Order;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowOrderScene {

    private Stage window;
    private Scene scene;
    private GridPane vbox = new GridPane();

    public ShowOrderScene(Stage primaryStage, ModelApp modelApp) {

        window = primaryStage;
        window.setTitle("Aktuálne objednávky");

        vbox.setPadding(new Insets(20, 20, 20, 20));

        int row = 0;
        for(Order order : modelApp.orders){

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
            GridPane.setConstraints(condition, 0, row++);
            GridPane.setConstraints(enter, 0, row++);

            row++;

            vbox.getChildren().addAll(customerID, size, typeOfSuit, clothMaterial, design, designDescription, condition, enter);
        }

        scene = new Scene(vbox, 400, 600);
        window.setScene(scene);
        window.show();
    }

    public Stage getWindow() {
        return window;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public GridPane getVbox() {
        return vbox;
    }

    public void setVbox(GridPane vbox) {
        this.vbox = vbox;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
