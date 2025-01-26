package ru.smirnovjavadev;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private static final Map<String, Map<String, String>> PRODUCTS = new HashMap<>();

    static {
        Map<String, String> auraInteriorPaints = new HashMap<>();
        auraInteriorPaints.put("Nord", "0,9         17113\n" +
                                        "2,7        17114\n" +
                                        "9          17115");
        auraInteriorPaints.put("Fjord", "0,9        17116\n" +
                                        "2,7        17117\n" +
                                        "9          17118");
        auraInteriorPaints.put("Mattlatex", "0,9            ");

        Map<String, String> eskaroInteriorPaints = new HashMap<>();

        Map<String, String> facadePaints = new HashMap<>();
        facadePaints.put("Лак матовый", "1л, 2л");
        facadePaints.put("Лак глянцевый", "0.75л, 1.5л");

        Map<String, String> decor = new HashMap<>();

        Map<String, String> enamels = new HashMap<>();

        Map<String, String> woodProducts = new HashMap<>();

        PRODUCTS.put("Интерьерные краски Aura", auraInteriorPaints);
        PRODUCTS.put("Интерьерные краски Eskaro", eskaroInteriorPaints);
        PRODUCTS.put("Фасадные краски", facadePaints);
        PRODUCTS.put("Декоративные составы", decor);
        PRODUCTS.put("Эмали", enamels);
        PRODUCTS.put("Лаки, Масла и Лазури", woodProducts);
    }

    public static Map<String, Map<String, String>> getProducts() {
        return PRODUCTS;
    }
}

