public class View {
    Inventory inv = new Inventory();
    public void View() {
        System.out.println("\t\tWelcome to little miss matcha ⠀\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀:¨ ·.· ¨:\n" + //
                        "⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ ⠀⠀ `· . 𐙚" + "\n");
    }
    public void Menu() {
        inv.showInventory();
    }
    
}
