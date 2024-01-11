public class Main {
    public static void main(String[] args) {
        // Array of Integers of size 5
        Integer[] array = new Integer[5];

        // Arrays always start from index 0

        // Populating values in arrays
        array[0] = 234;
        array[1] = 32;
        array[2] = 1;
        array[3] = 345;
        array[4] = 24;

        for (int index = 0; index <= 4; index++) {
            System.out.println("Index: " + index + " and value: " + array[index]);
        }

        System.out.println("We have completed our for loop");

        /**
         * Create a string array of fruitBasket with 5 fruits
         * Then print the all fruits in the array using for loop
         * And in final print the statement that we have eaten all the above fruits
         */
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cheeku";
        fruits[3] = "mango";
        fruits[4] = "grapes";
        for (int index = 0; index <= 4; index++) {
            System.out.println("Index:" + index + "and value: " + fruits[index]);

        }

        System.out.println("We have eaten all our fruits.");
    }

}
