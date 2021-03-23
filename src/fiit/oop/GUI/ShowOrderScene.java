package fiit.oop.GUI;

import fiit.oop.Core.Order;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowOrderScene {

    protected Order order;

    protected Stage window;
    protected GridPane grid = new GridPane();

    // labels
    protected Label customerID = new Label("CustomerID: " + order.getCustomerID());
    protected Label size = new Label("Veľkosť obleku je " + order.getSize());
    protected Label typeOfSuit = new Label("Typ obleku je: " + order.getTypeOfSuit());
    protected Label clothMaterial = new Label("Použítý materiál: " + order.getClothMaterial().getItemName());
    protected Label condition = new Label("Práce na objednávke sú vo fáze " + order.getCondition());

    protected Scene scene = new Scene(grid, 200, 800);

    public ShowOrderScene(Stage primaryStage, Order order) {

        if(order == null)
            this.order = null;

        this.order = order;

        window = primaryStage;
        window.setTitle("Stav Objednávky");

        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(15);
        grid.setHgap(15);

        GridPane.setConstraints(customerID, 0, 0);
        GridPane.setConstraints(size, 0, 1);
        GridPane.setConstraints(typeOfSuit, 0, 2);
        GridPane.setConstraints(clothMaterial, 0, 3);
        GridPane.setConstraints(condition, 0, 4);

        grid.getChildren().addAll(customerID, size, typeOfSuit, clothMaterial, condition);

        window.setScene(scene);
        window.show();
    }

    // konštruktor na preťažovanie pri CreatOrderScene
    public ShowOrderScene(Stage primaryStage) {

    }
}
