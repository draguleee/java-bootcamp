import product.Shirt;

import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {

        // Create a Shirt object
        Shirt shirt = new Shirt(10.99, "Red", "Nike", SMALL);
        shirt.fold();
        
        // Create a Pants object
        Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);
        pants.fold();

        // Prints the product details and wear the product
        productStore(shirt);
        productStore(pants);

    }

    /**
     * productStore() - prints the product's brand, product's class and product's price
     * @param product
     */
    public static void productStore(Product product) {
        System.out.println("\nThank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
        product.wear();
    }

}
