public class Inventory {

    // a final array of Product types to prevent users from modifying the product inventory
    // Product is a class with constructor Product(String name, float price)
    final Product[] products = {
        new Product("ceremonial matcha", (float) 18.99),
        new Product("matcha whisk", (float) 5.99),
        new Product("matcha bowl", (float) 7.99),
        new Product("culinary matcha", (float) 9.99)
    };

    

    public void showInventory() {
        // Print out objects in the inventory; this is called by View to print out the menu
        for (int i = 0; i < products.length; i++) {
            // System.out.print(products[i].product + "\t ‧₊˚❀༉‧₊˚. \t");
            System.out.print(i + "𓈒⋆ ۪");
            System.out.printf("%20s", products[i].product); // printf used for formatted output
            /* %20s allocates 20 spaces to display text. 
             * This makes it easier for the text to be aligned as long as they are less than 
             * 20 characters long.
            */
            System.out.print("\t ‧₊˚❀༉‧₊˚. \t");
            System.out.print("$" + products[i].price);
            System.out.println();
        }
    }
}
