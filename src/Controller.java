import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Controller {
    private Model model;
    private View view;
    private String status = "y";
    // private Delivery delivery = new Delivery();
    // private MyFirstForm f = new MyFirstForm();

    Scanner sc = new Scanner(System.in);

    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    private void purchase() {
        int i; // item number
        int q; // quantity
        System.out.print("Enter the item #: ");
        i = sc.nextInt();
        System.out.print("Quantity: ");
        q = sc.nextInt();
        model.cart.addToCart(view.inv.products[i].product, view.inv.products[i].price, q);

        // System.out.println("In cart: ");
        // for (int j = 0; j < model.cart.inCart.size(); j++) {
        //     System.out.println(model.cart.inCart.elementAt(j).product);
        //     System.out.println(model.cart.inCart.elementAt(j).quantity);
        // }
        status = "y";

        shopView();

    }

    private void checkStat() {
        String choice;
        sc = new Scanner(System.in); // Create new scanner object to clear buffer
        System.out.println("Continue shopping (y/p/n/c/.)? ");
        System.out.println("y - yes\t| p - purchase\t|     n - no\t|  c - cart | . - options");
        System.out.print("Choice >> ");
        choice = sc.nextLine();
        System.out.println();

        switch(choice) {
            case "y":
                shopView();
                break;
            case ".":
                Options();
                break;
            case "n":
                System.exit(0);
            case "p":
                purchase();
                break;
            case "c":
                getCart(model.cart);
                break;
            default:
                System.out.println("Invalid input! Please try again.");
                checkStat();
                
        }
    }

    private void logIn() {
        System.out.println("Please log in before you shop");
        System.out.print("Email: ");
        model.customer.setEmail(sc.nextLine());
        System.out.print("First name: ");
        model.customer.setFname(sc.nextLine());
        System.out.print("Last name: ");
        model.customer.setLname(sc.nextLine());
    }

    private void Options() {

        view.Options(model.customer);
        checkStat();
    }

    private void getCart(Cart c) {
        view.showCart(c);
        checkOut();

    }

    private void checkOut() {
        System.out.println("Checkout? ");
        System.out.println("  y - yes\t|     n - no\t| . - options");
        System.out.print("Choice >> ");
        status = sc.nextLine();
        if (status.equals("y")) {
            String s;
            int i;
            System.out.print("Street Address: ");
            s = sc.nextLine();
            model.customer.address.setStreetAddr(s);
            System.out.print("City: ");
            s = sc.nextLine();
            model.customer.address.setCity(s);
            System.out.print("State: ");
            s = sc.nextLine();
            model.customer.address.setState(s);
            System.out.print("Zip Code: ");
            i = sc.nextInt();
            model.customer.address.setZip(i);
            setDelivery();
        } else if (status.equals("n")) {
            shopView();
        } else if (status.equals(".")) {
            Options();
        } else {
            System.out.println("\n\nInvalid input. Please try again!");
            checkOut();
        }
    }

    private void setDelivery() {
        System.out.println("Set delivery date on calendar application: ");
        new Delivery();
        // delivery.Calendar();
        // delivery.getSystemTime();
    }

    public void initView() {
        view.Greet();
        logIn();
        shopView();
    }

    public void shopView() {

        do {
            view.Menu();
            checkStat();
    
        } while (true);
    }

}
