public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle is " + rectangle.calculateArea(5, 6));
        System.out.println("Perimeter of rectangle is " + rectangle.calculatePerimeter(2, 8));
        System.out.println("Perimeter of circle is " + rectangle.calculatePerimeterOfCircle(4));
        // here calculatePerimeterOfCircle is called function call.
        System.out.println("Area of circle is " + rectangle.calculateAreaOfCircle(5));

    }
}
