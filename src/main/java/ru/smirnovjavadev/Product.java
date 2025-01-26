package ru.smirnovjavadev;

import java.util.HashMap;

public class Product {

    private HashMap<Integer, String> productMap;

    public Product(HashMap<Integer, String> productMap) {
        this.productMap = productMap;
    }

    public HashMap<Integer, String> getProductMap() {
        return productMap;
    }

    public void setProductMap(HashMap<Integer, String> productMap) {
        this.productMap = productMap;
    }
}
