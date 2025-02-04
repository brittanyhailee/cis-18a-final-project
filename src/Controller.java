import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private String status = "y";

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
        String result;
        sc = new Scanner(System.in); // Create new scanner object to clear buffer
        System.out.println("Continue shopping (y/p/n/.)? ");
        System.out.println("y - yes\t|     n - no\t| p - purchase\t| . - options");
        System.out.print("Choice >> ");
        result = sc.nextLine();
        System.out.println();

        switch(result) {
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
            default:
                System.out.println("Invalid input! Please try again.");
                checkStat();
                
        }
        // System.out.println("result is " + result);


        // return (result.equalsIgnoreCase("y")) ? "y"
        //         : result.equalsIgnoreCase(".") ? "." : result.equalsIgnoreCase("p") ? "p" : "n";
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

        view.Options(model.customer, model.cart);
        checkStat();
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
