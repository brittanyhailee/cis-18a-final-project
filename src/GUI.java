/* This is a business program selling matcha
 * GUI.java contains the main() program.
 * To run the program, select 'Run and Debug' on VSCode or other IDEs 
 */


public class GUI {

    public static void main(String[] args) throws java.io.IOException {
        Model m = new Model(); // create Model object
        /* Model -> holds Customer and Cart objects */

        View v = new View(); // create View object
        /* View -> prints out user details, holds Inventory object, prints item in user's cart */

        Controller c = new Controller(m,v); // pass Model and View object to Controller
        c.initView(); // Call initView of controller to start the business program
        

    }
    

}
