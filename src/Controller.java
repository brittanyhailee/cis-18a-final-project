import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private boolean status = true;
    Scanner sc = new Scanner(System.in);

    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    private boolean checkStat() {
        String result;
        System.out.print("Continue shopping (y/n)? ");
        result = sc.nextLine();
        System.out.println();
        // System.out.println("result is " + result);
        // System.out.println("will return  " + ((result == "y") ? true : false));
        return (result.equalsIgnoreCase("y")) ? true : false;
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

    public void initView() {
        view.Greet();
        logIn();
        while (status == true) {
            view.Menu();
            status = checkStat();

        }
    }

}
