package ru.smirnovjavadev;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Заголовок окна
        primaryStage.setTitle("Лакокрасочные продукты");

        // Создание компонентов
        ComboBox<String> typeComboBox = new ComboBox<>();
        ComboBox<String> productComboBox = new ComboBox<>();
        TextField detailsField = new TextField();
        detailsField.setEditable(false);
        detailsField.setPromptText("Выбранный продукт и фасовки будут здесь...");

        // Кнопка и логика копирования
        Button copyButton = new Button("Копировать выделенное");
        copyButton.setOnAction(e -> {
            String selectedText = detailsField.getSelectedText();
            if (selectedText != null && !selectedText.isEmpty()) {
                Clipboard clipboard = Clipboard.getSystemClipboard();
                ClipboardContent content = new ClipboardContent();
                content.putString(selectedText);
                clipboard.setContent(content);
            }
        });

        // Обработка выбора типа продукта
        typeComboBox.setItems(FXCollections.observableArrayList(ProductService.getProducts().keySet()));
        typeComboBox.setOnAction(e -> {
            String selectedType = typeComboBox.getValue();
            if (selectedType != null) {
                productComboBox.setItems(FXCollections.observableArrayList(ProductService.getProducts().get(selectedType).keySet()));
            }
        });

        // Обработка выбора конкретного продукта
        productComboBox.setOnAction(e -> {
            String selectedType = typeComboBox.getValue();
            String selectedProduct = productComboBox.getValue();
            if (selectedType != null && selectedProduct != null) {
                String details = ProductService.getProducts().get(selectedType).get(selectedProduct);
                detailsField.setText("Фасовки: " + details);
            }
        });

        // Контейнер для элементов
        VBox layout = new VBox(10, typeComboBox, productComboBox, detailsField, copyButton);
        layout.setPrefSize(400, 400);

        // Создание сцены и отображение
        Scene scene = new Scene(layout);
        primaryStage.setTitle("Продукты и фасовки");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
