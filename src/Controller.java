public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    public void initView() {
        view.Menu();
    }
}
