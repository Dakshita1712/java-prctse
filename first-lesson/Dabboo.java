public class Dabboo {
    public String name = "Dabboo";
    public Integer age = 2;
    public Integer heightInCm = 145; // how can i represent height in cm
    public Integer weightInKg = 46; // how can i represent weight in kg

    String collegeName;

    // methods of dabboo class
    public void work() {
        System.out.println("Dabboo is working");// what does ln stand for?
    }

    public void sleep() {
    }

    public void eat() {
    }

    public void study() {
    }

    public void play() {
    }

    public Integer A = 2;
    public Integer B = 3;

    public void doMath() {
        System.out.println(A + B);
    }

    public Integer C = 4;
    public Integer D = 5;

    public void doMultiply() {
        System.out.println(C * D);
    }

    public void swapNumbers() {
        // A, B -> 2, 3
        // A, B -> 3, 2
        // Not allowed -> A = 3, B = 2
        System.out.println("Original values of A - " + A + " and B " + B);

        // METHOD 1: SWAPPED USING THIRD VARIABLE
        Integer tempVar = A; // tempVar -> 2
        A = B; // A -> 3, B -> 3
        B = tempVar;

        System.out.println("Values after swapping A - " + A + " and B" + B);

        // TODO: SWAP WITHOUT USING THIRD VARIABLE
    }

    public double convertDabbooHeightInFoot() {
        // System.out.println(155 / 30.48);
        return 155 / 30.48;
    }
}
