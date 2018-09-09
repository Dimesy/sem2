import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(10.0);
        Ball b3 = new Ball(15.0, "pink");
        Ball b4 = new Ball("yellow");
        b1.setRadius(6.0);


/**        System.out.println(
                "Radius is " + b1.getRadius() + ", Color is " + b1.getColor() +
                "\nRadius is " + b2.getRadius() + ", Color is " + b2.getColor() +
                "\nRadius is " + b3.getRadius() + ", Color is " + b3.getColor() +
                "\nRadius is " + b4.getRadius() + ", Color is " + b4.getColor());
**/
        System.out.println(b3);
        b1.one();
        b2.one();
        b3.one();
        b4.one();
    }
}
