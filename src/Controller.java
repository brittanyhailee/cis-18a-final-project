import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private boolean signedIn = false;
    private boolean status = true;
    Scanner sc = new Scanner(System.in);

    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    private boolean checkStat() {
        String result;
        System.out.println("Continue shopping (y/n)? ");
        result = sc.nextLine();
        // System.out.println("result is " + result);
        // System.out.println("will return  " + ((result == "y") ? true : false));
        return (result.equalsIgnoreCase("y")) ? true : false;
    }

    public void initView() {
        while (status == true) {
            view.Greet();
            view.Menu();
            status = checkStat();
        }
    }

}
