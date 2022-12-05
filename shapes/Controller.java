package shapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
    private Model model;
    private View view;
    public String shapeString;
    public String colorString;
    public int wh;

    public Controller(Model model, View view) {

        this.model = model;
        this.view = view;

        this.view.addShapeListener(new ShapeListener());
        this.view.addColorListener(new ColorListener());
        this.view.addSliderListener(new SliderListener());
    }

    class ShapeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            wh = view.getSliderValue();
            shapeString = event.getActionCommand();
            model.setShape(shapeString, wh);
            view.setShape(model.getShape());
            view.repaint();
        }
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            wh = view.getSliderValue();
            colorString = event.getActionCommand();
            model.setColor(colorString, shapeString, wh);
            view.setShape(model.getShape());
            view.repaint();
        }
    }

    class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            wh = ((JSlider) e.getSource()).getValue();

            model.setShape(shapeString, wh);
            view.setShape(model.getShape());
            view.repaint();

        }
    }

}