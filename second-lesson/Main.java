public class Main {
    public static void main(String[] args) {
        addTwoNumbers(2, 3);
        // This is function call to function subtract two numbers.
        subtractTwoNumbers(-1, -3);
        // multiplyTwoNumbers(3, 4);
        System.out.println("Product of two numbers is " + multiplyTwoNumbers(2, 3));

    }

    public static void addTwoNumbers(Integer num1, Integer num2) {
        Integer sum = num1 + num2;
        System.out.println(sum);
        System.out.println("Sum of two numbers is = " + sum);

    }
    // Region within {} is function.

    public static void subtractTwoNumbers(Integer num1, Integer num2) {
        Integer difference = num2 - num1;
        System.out.println("Difference of two numbers is = " + difference);
    }

    public static Integer multiplyTwoNumbers(Integer num1, Integer num2) {
        Integer product = num1 * num2;
        return product;
    }
}
