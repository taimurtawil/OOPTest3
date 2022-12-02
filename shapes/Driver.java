package shapes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import shapes.Controller;

import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("0");
                Controller controller = new Controller(model, view);
                controller.control();
            }
        });
    }
}
