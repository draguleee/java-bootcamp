import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {

        // Create a Shirt object
        Shirt shirt = new Shirt();
        shirt.setBrand("Nike");
        shirt.setColor("Blue");
        shirt.setPrice(20);
        shirt.setSize(SMALL);
        shirt.fold();
        productStore(shirt);

        // Create a Pants object
        Pants pants = new Pants();
        pants.setBrand("Levi's");
        pants.setColor("Black");
        pants.setPrice(40);
        pants.setWaist(32);
        pants.setLength(32);
        pants.fold();
        productStore(pants);

    }

    /**
     * productStore() - prints the product's brand, product's class and product's price
     * @param product
     */
    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
    }

}
