package fiit.oop.GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class ManagerScene {
    private Stage window = new Stage();
    private Scene scene;
    private GridPane grid = new GridPane();
    private Menu ordersMenu = new Menu("Objednávky");
    private MenuBar menuBar = new MenuBar();
    private BorderPane layout = new BorderPane();
    private VBox vBox = new VBox(10);
    private Button checkOrdersButton = new Button("Skontroluj počet objednávok");
    private Label ordersLabel = new Label("Aktuálny počet objednávok je: ");
    private Button logoutButton = new Button("Odhlasiť");
    private Label deletOrderLabel = new Label("Zadajte číslo objednávky kt. chcete vymazať");
    private TextField deletOrderField = new TextField();
    private Button deletOrderButton = new Button("Vymazať objednávku");

    public ManagerScene() {

        window.setTitle("Ste prihlásený ako Manager");

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        // Menu items
        ordersMenu.getItems().add(new MenuItem("Zobraziť objednávky"));
        ordersMenu.getItems().add(new MenuItem("Pridať novú objednávku"));

        menuBar.getMenus().addAll(ordersMenu);

        layout.setTop(menuBar);

        vBox.getChildren().addAll(checkOrdersButton, ordersLabel, deletOrderLabel, deletOrderField, deletOrderButton, logoutButton);
        vBox.setPadding(new Insets(50, 50, 50, 50));

        layout.setCenter(vBox);

        scene = new Scene(layout, 400, 400);

        window.setScene(scene);
    }

    public Label getDeletOrderLabel() {
        return deletOrderLabel;
    }

    public void setDeletOrderLabel(Label deletOrderLabel) {
        this.deletOrderLabel = deletOrderLabel;
    }

    public TextField getDeletOrderField() {
        return deletOrderField;
    }

    public void setDeletOrderField(TextField deletOrderField) {
        this.deletOrderField = deletOrderField;
    }

    public Button getDeletOrderButton() {
        return deletOrderButton;
    }

    public void setDeletOrderButton(Button deletOrderButton) {
        this.deletOrderButton = deletOrderButton;
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

    public Menu getOrdersMenu() {
        return ordersMenu;
    }

    public void setOrdersMenu(Menu ordersMenu) {
        this.ordersMenu = ordersMenu;
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

    public void setMenuBar(MenuBar menuBar) {
        this.menuBar = menuBar;
    }

    public BorderPane getLayout() {
        return layout;
    }

    public void setLayout(BorderPane layout) {
        this.layout = layout;
    }

    public VBox getvBox() {
        return vBox;
    }

    public void setvBox(VBox vBox) {
        this.vBox = vBox;
    }

    public Button getCheckOrdersButton() {
        return checkOrdersButton;
    }

    public void setCheckOrdersButton(Button checkOrdersButton) {
        this.checkOrdersButton = checkOrdersButton;
    }

    public Label getOrdersLabel() {
        return ordersLabel;
    }

    public void setOrdersLabel(Label ordersLabel) {
        this.ordersLabel = ordersLabel;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }

    public void setLogoutButton(Button logoutButton) {
        this.logoutButton = logoutButton;
    }
}