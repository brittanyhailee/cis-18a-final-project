public class View {
    Inventory inv = new Inventory();
    public void Greet() {
        System.out.println("\t\tWelcome to little miss matcha ⠀\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀:¨ ·.· ¨:\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ `· . 𐙚" + "\n");
    }
    public void Menu() {
        inv.showInventory();
        System.out.println("\nPress '.' for Options");
    }

    public void Options(Customer c, Cart cart) {
        System.out.println("\t\t𐙚Options𐙚");
        System.out.println("\tFirst name: \t" + c.getFname());
        System.out.println("\tLast name: \t" + c.getLname());
        System.out.println("\tEmail: \t\t" + c.getEmail());
    }
    
}
