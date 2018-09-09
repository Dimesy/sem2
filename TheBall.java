import java.lang.*;

public class Ball {

    private double radius;
    private String color;

    public Ball(double r, String c) {
        radius = r;
        color = c;
    }

    public Ball(double r) {
        radius = r;
        color = "purple";
    }

    public Ball(String c) {
        radius = 5.0;
        color = c;
    }

    public Ball() {
        radius = 5.0;
        color = "purple";
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void one() {
        System.out.println("Radius is " + radius + ", Color is " + color);

    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
