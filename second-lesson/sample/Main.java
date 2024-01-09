public class Main {
    public static void main(String[] args) {
        Integer mathsMarks = 99;
        Integer scienceMarks = 70;
        Integer englishMarks = 80;
        Integer hindiMarks = 76;
        Integer computerMarks = 100;

        /**
         * calculateTotalMarks will return the summ of marks of all subjects.
         */
        Integer totalMarks = calculateTotalMarks(mathsMarks, scienceMarks, englishMarks, hindiMarks, computerMarks);

        Integer percentage = calculatePercentage(totalMarks);

        System.out.println("Percentage of the student is " + percentage);
    }

    /**
     * calculateTotalMarks will return the summ of marks of all subjects.
     */
    public static Integer calculateTotalMarks(Integer maths, Integer science, Integer english, Integer hindi,
            Integer computer) {
        Integer sum = maths + science + english + hindi + computer;
        return sum;
    }

    /**
     * calculatePercentage will calculate the percentage of the student
     */
    public static Integer calculatePercentage(Integer totalMarks) {
        Integer percentage = totalMarks * 100 / 500;
        System.out.println("Percentage of Dabboo is " + percentage);
        return percentage;
    }

}
