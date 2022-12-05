package shapes;

import java.awt.event.*;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class View {
    private JFrame frame;
    private JButton circlebutton, rectanglebutton, trianglebutton, redButton, yellowButton, blueButton;
    public Icon icon;
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

        label = new JLabel(icon, SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        redButton = new JButton("Red");
        redButton.setActionCommand("Red");
        colorbtnpnl.add(redButton);

        yellowButton = new JButton("Yellow");
        yellowButton.setActionCommand("Yellow");
        colorbtnpnl.add(yellowButton);

        blueButton = new JButton("Blue");
        blueButton.setActionCommand("Blue");
        colorbtnpnl.add(blueButton);

        trianglebutton = new JButton("Triangle");
        trianglebutton.setActionCommand("Triangle");
        shapebtnpnl.add(trianglebutton);

        circlebutton = new JButton("Circle");
        circlebutton.setActionCommand("Circle");
        shapebtnpnl.add(circlebutton);

        rectanglebutton = new JButton("Rectangle");
        rectanglebutton.setActionCommand("Rectangle");
        shapebtnpnl.add(rectanglebutton);

        slider = new JSlider(JSlider.VERTICAL, 20, 150, 20);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        Hashtable position = new Hashtable();
        position.put(20, new JLabel("20"));
        position.put(30, new JLabel("30"));
        position.put(40, new JLabel("40"));
        position.put(50, new JLabel("50"));
        position.put(60, new JLabel("60"));
        position.put(70, new JLabel("70"));
        position.put(80, new JLabel("80"));
        position.put(90, new JLabel("90"));
        position.put(100, new JLabel("100"));
        position.put(110, new JLabel("110"));
        position.put(120, new JLabel("120"));
        position.put(130, new JLabel("130"));
        position.put(140, new JLabel("140"));
        position.put(150, new JLabel("150"));
        slider.setLabelTable(position);

        frame.getContentPane().add(colorbtnpnl, BorderLayout.SOUTH);
        frame.getContentPane().add(shapebtnpnl, BorderLayout.NORTH);
        frame.getContentPane().add(slider, BorderLayout.WEST);
    }

    public void setShape(Icon icon) {
        label.setIcon(icon);
    }

    public void repaint() {
        frame.repaint();
    }

    void addShapeListener(ActionListener listenerForShapeButton) {
        rectanglebutton.addActionListener(listenerForShapeButton);
        circlebutton.addActionListener(listenerForShapeButton);
        trianglebutton.addActionListener(listenerForShapeButton);
    }

    void addColorListener(ActionListener listenerForColorButton) {
        yellowButton.addActionListener(listenerForColorButton);
        blueButton.addActionListener(listenerForColorButton);
        redButton.addActionListener(listenerForColorButton);
    }

    void addSliderListener(ChangeListener listenerForSlider) {
        slider.addChangeListener(listenerForSlider);
    }

    public int getSliderValue() {
        return slider.getValue();
    }
}
