package shapes;

import javax.swing.*;

import shapes.Triangle;

import java.awt.*;
import java.awt.geom.*;

public class View {
    private JFrame frame;
    private JButton circlebutton, rectanglebutton, trianglebutton, redButton, greenButton, blueButton;

    private JLabel label;
    private JSlider slider;

    public View(String text) {
        frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        JPanel shapebtnpnl = new JPanel();
        shapebtnpnl.setLayout(new FlowLayout());

        JPanel colorbtnpnl = new JPanel();
        colorbtnpnl.setLayout(new FlowLayout());

        Icon icon = new Triangle(100, 100, Color.RED);
        label = new JLabel(icon, SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        redButton = new JButton("Red");
        colorbtnpnl.add(redButton);

        greenButton = new JButton("Green");
        colorbtnpnl.add(greenButton);

        blueButton = new JButton("Blue");
        colorbtnpnl.add(blueButton);

        trianglebutton = new JButton("Triangle");
        shapebtnpnl.add(trianglebutton);

        circlebutton = new JButton("Circle");
        shapebtnpnl.add(circlebutton);

        rectanglebutton = new JButton("Rectangle");
        shapebtnpnl.add(rectanglebutton);

        JSlider slider = new JSlider(JSlider.VERTICAL, 20, 150, 20);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        frame.getContentPane().add(colorbtnpnl, BorderLayout.SOUTH);
        frame.getContentPane().add(shapebtnpnl, BorderLayout.NORTH);
        frame.getContentPane().add(slider, BorderLayout.WEST);
    }

}
