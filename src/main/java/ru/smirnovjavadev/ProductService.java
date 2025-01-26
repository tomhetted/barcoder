package ru.smirnovjavadev;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ProductService {

    public static Map<String, Map<String, Product>> getProducts() {
        // Основная структура: тип -> продукт -> фасовки
        Map<String, Map<String, Product>> productData = new HashMap<>();

        // Данные для "Интерьерные краски Aura"
        Map<String, Product> auraInteriorPaints = new HashMap<>();
        auraInteriorPaints.put("Nord", new Product(new HashMap<>(Map.of(
                17113, "0,9л",
                17114, "2,7л",
                17115, "9л"
        ))));
        auraInteriorPaints.put("Fjord", new Product(new HashMap<>(Map.of(
                17116, "0,9л",
                17117, "2,7л",
                17118, "9л"
        ))));
        auraInteriorPaints.put("Mattlatex", new Product(new HashMap<>(Map.of(
                22885, "0,9л A",
                22886, "2,7л A",
                22887, "9л A",
                22888, "0,9л TR",
                22889, "2,7л TR",
                22890, "9л TR"
        ))));
        auraInteriorPaints.put("Golfström", new Product(new HashMap<>(Map.of(
                17119, "0,9л",
                17121, "2,7л",
                17122, "9л"
        ))));
        auraInteriorPaints.put("Satin", new Product(new HashMap<>(Map.of(
                17124, "0,9л",
                15968, "2,7л",
                15969, "9л"
        ))));
        productData.put("Интерьерные краски Aura", auraInteriorPaints);

        // Данные для "Интерьерные краски Eskaro"
        Map<String, Product> eskaroInteriorPaints = new HashMap<>();
        eskaroInteriorPaints.put("Moda 3", new Product(new HashMap<>(Map.of(
                27022, "0,9л A",
                27023, "2,7л A",
                27077, "9л A",
                27206, "0,9л TR",
                27207, "2,7л TR",
                27208, "9л TR"
        ))));
        eskaroInteriorPaints.put("Moda 7", new Product(new HashMap<>(Map.of(
                27024, "0,9л A",
                27025, "2,7л A",
                27078, "9л A",
                27209, "0,9л TR",
                27210, "2,7л TR",
                27211, "9л TR"
        ))));
        eskaroInteriorPaints.put("Moda Absolut Matt", new Product(new HashMap<>(Map.of(
                27200, "0,9л A",
                27201, "2,7л A",
                27202, "9л A",
                27203, "0,9л TR",
                27204, "2,7л TR",
                27205, "9л TR"
        ))));
        eskaroInteriorPaints.put("Akrit", new Product(new HashMap<>(Map.of(
                38682, "0,9л A",
                38683, "2,7л A",
                38684, "9л A",
                38685, "0,9л TR",
                38686, "2,7л TR"
        ))));
        productData.put("Интерьерные краски Eskaro",eskaroInteriorPaints);

        // Данные для "Фасадные краски Aura и Eskaro"
        Map<String, Product> facadePaints = new HashMap<>();
        facadePaints.put("Aura Expo", new Product(new HashMap<>(Map.of(
                19498, "2,7л A",
                19499, "9л A",
                19579, "2,7л TR",
                19497, "9л TR"
        ))));
        facadePaints.put("Aura Mansarda", new Product(new HashMap<>(Map.of(
                40516, "0,9л A",
                40517, "2,5л A",
                40518, "9л A",
                40519, "0,9л TR",
                40520, "2,5л TR",
                40521, "9л TR"
        ))));
        facadePaints.put("Eskaro Veranda", new Product(new HashMap<>(Map.of(
                40533, "0,95л A",
                40534, "2,85л A",
                22555, "9,5л A",
                40535, "0,9л TR",
                40536, "2,7л TR",
                40537, "9л TR"
        ))));
        productData.put("Фасадные краски Aura и Eskaro", facadePaints);

        // Данные для "Эмали Aura и Eskaro"
        Map<String, Product> enamels = new HashMap<>();
        enamels.put("Aura Remix", new Product(new HashMap<>(Map.of(
                19825, "0,9л A",
                19826, "2,4л A",
                23292, "0,9л TR",
                23293, "2,4л TR"
        ))));
        enamels.put("Aura Thermo", new Product(new HashMap<>(Map.of(
                22952, "0,45л",
                17127, "0,9л"
        ))));
        enamels.put("Eskaro Mööblivärv", new Product(new HashMap<>(Map.of(
                40538, "0,45л A",
                25045, "0,9л A",
                40539, "0,45л TR",
                40540, "0,9л TR"
        ))));
        productData.put("Эмали Aura и Eskaro", enamels);

        // Данные для "Лаки, масла и лазури"
        Map<String, Product> lacquersOilsLazurs = new HashMap<>();
        lacquersOilsLazurs.put("Aura Interior Lack", new Product(new HashMap<>(Map.of(
                25048, "1л",
                25049, "2,5л"
        ))));
        lacquersOilsLazurs.put("Eskaro Marine Lakk 40", new Product(new HashMap<>(Map.of(
                22064, "0,95л",
                40531, "2,4л"
        ))));
        lacquersOilsLazurs.put("Eskaro Terrace", new Product(new HashMap<>(Map.of(
                22608, "0,9л",
                40529, "2,7л",
                40530, "9л"
        ))));
        lacquersOilsLazurs.put("Aura Fasad Lazur", new Product(new HashMap<>(Map.of(
                38345, "0,9л",
                38346, "2,5л",
                38347, "9л"
        ))));
        productData.put("Лаки, масла и лазури Aura и Eskaro", lacquersOilsLazurs);

        // Данные для "Декоративные штукатурки и покрытия Aura Dekor"
        Map<String, Product> dekor = new HashMap<>();
        dekor.put("Aura Dekor Grund", new Product(new HashMap<>(Map.of(
                22883, "3,5кг",
                22884, "14кг"
        ))));
        dekor.put("Aura Dekor Putz Шуба 1,5мм", new Product(new HashMap<>(Map.of(
                16272, "8кг",
                16044, "25кг"
        ))));
        dekor.put("Aura Dekor Putz Шуба 2,5мм", new Product(new HashMap<>(Map.of(
                16273, "8кг",
                16045, "25кг"
        ))));
        dekor.put("Aura Dekor Putz Короед 2мм", new Product(new HashMap<>(Map.of(
                16270, "8кг",
                16965, "25кг"
        ))));
        dekor.put("Aura Dekor Putz Короед 3мм", new Product(new HashMap<>(Map.of(
                16271, "8кг",
                16043, "25кг"
        ))));
        dekor.put("Aura Dekor Structur", new Product(new HashMap<>(Map.of(
                22881, "2,5л",
                22882, "10л"
        ))));
        dekor.put("Aura Dekor Primer", new Product(new HashMap<>(Map.of(
             39174, "1,4кг",
             39175, "3,65кг"
        ))));
        dekor.put("Aura Dekor Matt Lack", new Product(new HashMap<>(Map.of(
                39184, "1кг"
        ))));
        dekor.put("Aura Dekor Atlas", new Product(new HashMap<>(Map.of(
                39176, "1кг",
                39177, "2,5кг"
        ))));
        dekor.put("Aura Dekor Kristall", new Product(new HashMap<>(Map.of(
                39178, "1кг",
                39179, "2,5кг"
        ))));
        dekor.put("Aura Dekor Nubuck", new Product(new HashMap<>(Map.of(
                39183, "1кг"
        ))));
        dekor.put("Aura Dekor Universum", new Product(new HashMap<>(Map.of(
                39182, "8кг"
        ))));
        dekor.put("Aura Dekor Grotto", new Product(new HashMap<>(Map.of(
                39180, "15кг"
        ))));
        dekor.put("Aura Dekor Loft", new Product(new HashMap<>(Map.of(
                39181, "15кг"
        ))));
        productData.put("Декоративные штукатурки и покрытия Aura Dekor", dekor);

        return productData;
    }
}


