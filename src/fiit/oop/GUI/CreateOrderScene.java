package fiit.oop.GUI;

import fiit.oop.Core.ModelApp;
import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateOrderScene {

    private Stage window;
    private GridPane grid = new GridPane();

    // labels
    private Label customerID = new Label("CustomerID: ");
    private Label size = new Label("Veľkosť obleku: ");
    private Label typeOfSuit = new Label("Typ obleku: ");
    private Label clothMaterial = new Label("Požadovaný materiál: ");

    // TextFields
    private TextField customerIDInput = new TextField();
    private TextField sizeInput = new TextField();
    private TextField typeOfSuitInput = new TextField();
    private TextField clothMaterialInput = new TextField();

    private Button createButton = new Button("Vytvoriť objednávku");
    private Scene scene = new Scene(grid, 300, 200);
    private ModelApp modelApp;

    public CreateOrderScene(Stage primaryStage, ModelApp modelApp) {
        this.modelApp = modelApp;
        this.window = primaryStage;

        GridPane.setConstraints(customerID, 0, 0);
        GridPane.setConstraints(size, 0, 1);
        GridPane.setConstraints(typeOfSuit, 0, 2);
        GridPane.setConstraints(clothMaterial, 0, 3);

        GridPane.setConstraints(customerIDInput, 1, 0);
        GridPane.setConstraints(sizeInput, 1, 1);
        GridPane.setConstraints(typeOfSuitInput, 1, 2);
        GridPane.setConstraints(clothMaterialInput, 1, 3);

        GridPane.setConstraints(createButton, 1, 4);

        grid.getChildren().addAll(customerID, size, typeOfSuit, clothMaterial);
        grid.getChildren().addAll(customerIDInput, sizeInput, typeOfSuitInput, clothMaterialInput, createButton);

        window.setScene(scene);
        window.show();
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

    public Label getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Label customerID) {
        this.customerID = customerID;
    }

    public Label getSize() {
        return size;
    }

    public void setSize(Label size) {
        this.size = size;
    }

    public Label getTypeOfSuit() {
        return typeOfSuit;
    }

    public void setTypeOfSuit(Label typeOfSuit) {
        this.typeOfSuit = typeOfSuit;
    }

    public Label getClothMaterial() {
        return clothMaterial;
    }

    public void setClothMaterial(Label clothMaterial) {
        this.clothMaterial = clothMaterial;
    }

    public TextField getCustomerIDInput() {
        return customerIDInput;
    }

    public void setCustomerIDInput(TextField customerIDInput) {
        this.customerIDInput = customerIDInput;
    }

    public TextField getSizeInput() {
        return sizeInput;
    }

    public void setSizeInput(TextField sizeInput) {
        this.sizeInput = sizeInput;
    }

    public TextField getTypeOfSuitInput() {
        return typeOfSuitInput;
    }

    public void setTypeOfSuitInput(TextField typeOfSuitInput) {
        this.typeOfSuitInput = typeOfSuitInput;
    }

    public TextField getClothMaterialInput() {
        return clothMaterialInput;
    }

    public void setClothMaterialInput(TextField clothMaterialInput) {
        this.clothMaterialInput = clothMaterialInput;
    }

    public Button getCreateButton() {
        return createButton;
    }

    public void setCreateButton(Button createButton) {
        this.createButton = createButton;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ModelApp getModelApp() {
        return modelApp;
    }

    public void setModelApp(ModelApp modelApp) {
        this.modelApp = modelApp;
    }
}