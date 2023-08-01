package ShopApp;

/**
 *
 * @author kenneth.santos
 */
public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Bem-vindo ao Duke Choise Shop!");

        Customer c1 = new Customer("Pink", 4);

        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S")};    

        

        // System.out.println("Item 1" + ", " + item1.description + ", " + item1.price + "," + item1.size + ".");
        // System.out.println("Item 2" + ", " + item2.description + ", " + item2.price + ", " + item2.size + ".");
        //  total = (item1.price + item2.price * 2) * (1 + tax);
        int measurement = 8;

        c1.addItems(items);

        //c1.setSize(measurement);
      
        System.out.println("O nome do cliente é " + c1.getName() + ", " + ", seu tamanho é " + c1.getSize() + ", $" + c1.getTotalClothingCost() + ".");

        for (Clothing item : c1.getItems()) {
            System.out.println("Items " + item.getDescription());

        }

    }
}
