import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;

public class Main {

    public static void main(String[] args) {

        // Create a Shirt object
        Shirt shirt = new Shirt();
        shirt.setBrand("Nike");
        shirt.setColor("Blue");
        shirt.setPrice(20);
        shirt.setSize(SMALL);
        shirt.fold();

        // Create a Pants object
        Pants pants = new Pants();
        pants.setBrand("Levi's");
        pants.setColor("Black");
        pants.setPrice(40);
        pants.setWaist(32);
        pants.setLength(32);
        pants.fold();

    }

}
