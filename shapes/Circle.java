package shapes;

import javax.swing.Icon;
import java.awt.*;
import java.awt.geom.*;

public class Circle implements Icon {
    private int width;
    private int height;
    private Color color;

    public Circle(int width, int height, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public Color getIconColor() {
        return color;
    }

    public void setIconwh(int wh) {
        this.height = wh;
        this.width = wh;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, height);

        g2.setColor(color);
        g2.fill(ellipse);

    }
}
// https://www.codespeedy.com/how-to-draw-a-circle-in-java-gui/