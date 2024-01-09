public class Main {

    /**
     * Class -> variables names and functions only
     * Function -> println is allowed.
     */

    public static void main(String[] args) {
        // We are creating object from blueprint
        Dabboo dabboo = new Dabboo();
        dabboo.work();
        dabboo.doMath();
        dabboo.doMultiply(); // making function call to doMultiply() function

        // Values can be printed in any function whether is main function or dabboo's
        // function
        // Variables and function return values both can also be printed
        System.out.println("Dabboo's height is " + dabboo.heightInCm + " cm");
        System.out.println(dabboo.convertDabbooHeightInFoot());
        System.out.println("Dabboo's weight is " + dabboo.weightInKg + " kg");

        // System.out.println(dabboo.swapNumbers()); this will not work because
        // swap numbers function return void and println does not accept void in
        // argument.

        dabboo.swapNumbers();
    }
}