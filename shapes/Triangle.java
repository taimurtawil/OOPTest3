package shapes;

import javax.swing.Icon;
import java.awt.*;
import java.awt.geom.*;

public class Triangle implements Icon {
    private int width;
    private int height;
    private Color color;

    public Triangle(int width, int height, Color color) {
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

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        TriangleShape triangle = new TriangleShape(x, y, width, height);

        g2.setColor(color);
        g2.fill(triangle);

    }
}

class TriangleShape extends Path2D.Double {
    public TriangleShape(int x, int y, int width, int height) {
        moveTo(x, y);
        lineTo(x + width, y);
        lineTo(x + width / 2, y + height);
        closePath();
    }
}
