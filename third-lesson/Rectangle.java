public class Rectangle {
    Integer calculateArea(Integer length, Integer breadth) {
        Integer area = length * breadth;
        return area;
    }

    Integer calculatePerimeter(Integer length, Integer breadth) {
        Integer perimeter = 2 * (length + breadth);
        return perimeter;

    }

    Double calculatePerimeterOfCircle(Integer radius) {
        Double perimeter = 2 * 3.14 * radius;
        return perimeter;

    }

    Double calculateAreaOfCircle(Integer radius) {
        Double area = 3.14 * radius * radius;
        return area;

    }

}
