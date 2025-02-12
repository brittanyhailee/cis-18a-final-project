import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.JButton;

public class Controller {
    private Model model;
    private View view;
    private String status = "y";

    Scanner sc = new Scanner(System.in); // Create Scanner object to get user input

    // Controller constructor that instantiates the model and view objects
    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    // purchase() is when user wants to purchase a product. 
    private void purchase() {
        int i = 0; // item number
        int q; // quantity

        /* User is prompted to enter the index of the product they want to purchase. 
            The do-while loop below will run at least once, after its first run,
            it will check whether the user's inputted value is within the bounds of the 
            product inventory to ensure no out-of-bounds error will occur. If it is, then the loop
            will keep asking the user for a valid input. 
        */
        do {
            if (i > (view.inv.products.length)-1) {
                System.out.println("\nInvalid input (Out of Bounds)! Try again.");
            }
            System.out.print("Enter the item #: ");
            i = sc.nextInt();
        } while((i > (view.inv.products.length)-1)); // For user validation.

        System.out.print("Quantity: ");
        q = sc.nextInt();
        model.cart.addToCart(view.inv.products[i].product, view.inv.products[i].price, q);
        status = "y";

        shopView();
    }

    /* checkStat() determines which action the customer wants to take i.e.,
     * to continue shopping, see user information, stop shopping, check cart, or if invalid 
     * input, call checkStat() again.
     */
    private void checkStat() {
        String choice;
        sc = new Scanner(System.in); // Create new scanner object to clear buffer
        System.out.println("Continue shopping (y/p/n/c/.)? ");
        System.out.println("y - yes\t| p - purchase\t|     n - no\t|  c - cart | . - options");
        System.out.print("Choice >> ");
        choice = sc.nextLine();
        System.out.println();

        switch(choice) {
            case "y": // Yes, user wants to continue shopping
                shopView(); 
                break;
            case ".": // Options, user wants to see profile information
                Options();
                break;
            case "n": // No, user wants to exit the program
                System.exit(0);
            case "p": // Purchase, user wants to purchase something
                purchase();
                break;
            case "c": // Cart, user wants to see what's in their cart
                getCart(model.cart);
                break;
            default: // User picked an invalid choice 
                System.out.println("Invalid input! Please try again.");
                checkStat(); 
                
        }
    }

    // logIn() is responsible for setting the values of the model.customer object. 
    private void logIn() {
        System.out.println("Please log in before you shop");
        System.out.print("Email: ");
        model.customer.setEmail(sc.nextLine());
        System.out.print("First name: ");
        model.customer.setFname(sc.nextLine());
        System.out.print("Last name: ");
        model.customer.setLname(sc.nextLine());
    }

    // Calls the Options method from view that shows the first name, last name, and 
    // email of the customer.
    private void Options() {
        view.Options(model.customer);
        checkStat(); // call checkStat() again to continue the program.
    }

    // getCart() is called in checkStat() if user wants to see what is inside their cart.
    private void getCart(Cart c) {
        view.showCart(c); // Call showCart() function from view
        checkOut(); // Call checkOut function that checks whether user wants to checkout

    }


    private void checkOut() {
        // Ask if user wants to checkout
        System.out.println("Checkout? ");
        System.out.println("  y - yes\t|     n - no\t| . - options");
        System.out.print("Choice >> ");
        status = sc.nextLine(); // Asks for user input

        // If user wants to  checkout, they are asked for their street 
        // address, city, state, and zip code. 
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
            setDelivery(); // calls setDelivery that prompts user to select delivery date
        } else if (status.equals("n")) {
            shopView(); // If user does NOT want to checkout, they are back to seeing Menu items.
        } else if (status.equals(".")) {
            Options(); // User wants to check personal information
        } else { // User input invalid choice
            System.out.println("\n\nInvalid input. Please try again!");
            checkOut(); // Call the function again
        }
    }

    private void setDelivery() {
        System.out.println("Set delivery date on calendar application...");

        // Calls GUI made with Java Swing that allows user to select delivery date
        new Delivery(model.customer.getFname(), model.cart);         
     
    }

    // The initial view for the user when program starts 
    public void initView() {
        view.Greet();
        logIn();
        shopView();
    }

    // shopView() will continue to keep showing the menu and checkStat() to 
    // monitor the user actions throughout the program and if they want to stop.
    public void shopView() {
            do {
                view.Menu();
                checkStat();
        
            } while (true);
    }

}
