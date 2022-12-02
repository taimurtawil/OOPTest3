package shapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;
    public String shapeString;
    public String colorString;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    class ShapeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            shapeString = event.getActionCommand();
            model.setShapeString(shapeString);
            view.setShapeString(shapeString);
            view.repaint();
        }
    }

}