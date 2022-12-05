package shapes;

import javax.swing.Icon;
import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements Icon {
    private int width;
    private int height;
    private Color color;

    public Rectangle(int width, int height, Color color) {
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

    public void setColor(Color color) {
        this.color = color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);

        g2.setColor(color);
        g2.fill(rectangle);

    }
}
// https://www.codespeedy.com/how-to-draw-a-circle-in-java-gui/