public class View {
    Inventory inv = new Inventory();
    public void Greet() {
        System.out.println("\t\tWelcome to Little Miss Matcha ⠀\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀:¨ ·.· ¨:\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ `· . 𐙚" + "\n");
    }
    public void Menu() {
        System.out.println("\n\n\t\t❀༉Menu❀༉");
        inv.showInventory();
        // System.out.println("\nPress '.' for Options");
    }

    public void Options(Customer c) {
        System.out.println("\t\t𐙚Options𐙚");
        System.out.println("\tFirst name: \t" + c.getFname());
        System.out.println("\tLast name: \t" + c.getLname());
        System.out.println("\tEmail: \t\t" + c.getEmail());

        System.out.println();

    }

    public void showCart(Cart cart) {
        System.out.println("\t\t𐙚Cart𐙚");
        for (int j = 0; j < cart.inCart.size(); j++) {
            // System.out.printf("%20s", products[i].product);

            System.out.printf("%20s",cart.inCart.elementAt(j).product);
            System.out.print("\t‧₊˚❀༉\t");
            System.out.print("$"+cart.inCart.elementAt(j).price);
            System.out.println();
        }
        
    }
    
}
