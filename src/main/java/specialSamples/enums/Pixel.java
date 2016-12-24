package specialSamples.enums;

/**
 * Created by MaximVL on 04.04.2016.
 */
public class Pixel {
    private double x;
    private double y;
    private Color Color;

    public Pixel(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        Color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Pixel{" +
                "x=" + x +
                ", y=" + y +
                ", Color=" + Color +
                '}';
    }
}
