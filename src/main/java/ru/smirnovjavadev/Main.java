package ru.smirnovjavadev;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Получение данных через ProductService
        Map<String, Map<String, Product>> productData = ProductService.getProducts();

        // Создание компонентов интерфейса
        ComboBox<String> typeComboBox = new ComboBox<>();
        ComboBox<String> productComboBox = new ComboBox<>();
        VBox detailsBox = new VBox(5); // Отображение информации о фасовках

        // Заполнение первого ComboBox (типы продуктов)
        typeComboBox.setItems(FXCollections.observableArrayList(productData.keySet()));
        typeComboBox.setStyle("-fx-font-size: 20px;");
        productComboBox.setStyle("-fx-font-size: 20px;");

        // Обработка выбора типа продукта
        typeComboBox.setOnAction(e -> {
            String selectedType = typeComboBox.getValue();
            if (selectedType != null) {
                productComboBox.setItems(FXCollections.observableArrayList(productData.get(selectedType).keySet()));
            }
        });

        // Обработка выбора конкретного продукта
        productComboBox.setOnAction(e -> {
            String selectedType = typeComboBox.getValue();
            String selectedProduct = productComboBox.getValue();
            detailsBox.getChildren().clear(); // Очистка предыдущих данных

            if (selectedType != null && selectedProduct != null) {
                Product product = productData.get(selectedType).get(selectedProduct);
                if (product != null) {
                    // Заполнение detailsBox: строки из ID, фасовки и кнопки "Копировать"
                    product.getProductMap().forEach((id, volume) -> {
                        // TextField для ID
                        TextField idField = new TextField(id.toString());
                        idField.setEditable(false); // Запрещаем редактирование
                        idField.setPrefWidth(80);
                        idField.setStyle("-fx-font-size: 20px;");

                        // Label для фасовки
                        Label volumeLabel = new Label(volume);
                        volumeLabel.setStyle("-fx-font-size: 20px;");

                        // Кнопка "Копировать"
                        Button copyButton = new Button("Копировать баркод");
                        copyButton.setStyle("-fx-font-size: 20px;");
                        copyButton.setOnAction(copyEvent -> {
                            Clipboard clipboard = Clipboard.getSystemClipboard();
                            ClipboardContent content = new ClipboardContent();
                            content.putString(id.toString()); // Копируем ID в буфер обмена
                            clipboard.setContent(content);
                        });

                        // Объединяем элементы в строку
                        HBox row = new HBox(10, copyButton, idField, volumeLabel);
                        detailsBox.getChildren().add(row);
                    });
                }
            }
        });

        // Компоновка интерфейса
        VBox layout = new VBox(10, typeComboBox, productComboBox, detailsBox);
        layout.setPadding(new Insets(10));
        layout.setPrefSize(556, 420);
        layout.setStyle("-fx-background-color: #a981de;"); // Фиолетовый фон

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
