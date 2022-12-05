package shapes;

import java.awt.*;

import javax.swing.Icon;

public class Model {
    private int value;
    private Icon shape;
    private Color color;

    public Model(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Icon getShape() {
        return shape;
    }

    public void setShape(String shapeString, int wh) {
        switch (shapeString) {
            case "Rectangle":
                Rectangle rec = new Rectangle(wh, wh, color);
                this.shape = rec;
                break;
            case "Triangle":
                Triangle tri = new Triangle(wh, wh, color);
                this.shape = tri;
                break;
            case "Circle":
                Circle cir = new Circle(wh, wh, color);
                this.shape = cir;
            default:
                break;
        }

    }

    public Color getColorString() {
        return color;
    }

    public void setColor(String color, String shapeString, int wh) {
        switch (color) {
            case "Red":
                this.color = Color.RED;
                setShape(shapeString, wh);
                break;
            case "Blue":
                this.color = Color.BLUE;
                setShape(shapeString, wh);
                break;
            case "Yellow":
                this.color = Color.YELLOW;
                setShape(shapeString, wh);
                break;
            default:
                break;
        }
    }

}