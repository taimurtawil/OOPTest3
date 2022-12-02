package shapes;

import java.awt.*;

public class Model {
    private int value;
    private String shapeString;
    private String colorString;
    private int width;
    private int height;
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

    public String getShapeString() {
        return shapeString;
    }

    public void setShapeString(String shapeString) {
        this.shapeString = shapeString;
    }

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}