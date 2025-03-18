package java;
import java.util.HashMap;
import java.util.Map;

public class ProductMapExample {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();

        productMap.put("P001", new Product("P001", "Laptop", 75000));
        productMap.put("P002", new Product("P002", "Smartphone", 50000));
        productMap.put("P003", new Product("P003", "Tablet", 30000));
        productMap.put("P004", new Product("P004", "Smartwatch", 10000));
        productMap.put("P005", new Product("P005", "Headphones", 5000));

        String searchCode = "P003";
        if (productMap.containsKey(searchCode)) {
            System.out.println("Product found: " + productMap.get(searchCode));
        } else {
            System.out.println("Product with code " + searchCode + " not found.");
        }
    }
}
