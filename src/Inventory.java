public class Inventory {


    private Product[] products = {
        new Product("ceremonial matcha", (float) 18.99),
        new Product("matcha whisk", (float) 5.99),
        new Product("matcha bowl", (float) 7.99)
        new Product("culinary matcha", (float) 9.99)
    };

    

    public void showInventory() {
        for (int i = 0; i < products.length; i++) {
            // System.out.print(products[i].product + "\t ‧₊˚❀༉‧₊˚. \t");
            System.out.printf("%20s", products[i].product);
            System.out.print("\t ‧₊˚❀༉‧₊˚. \t");
            System.out.print(products[i].price);
            System.out.println();
        }
    }
}
