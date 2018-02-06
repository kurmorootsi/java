public class EX00 {
    /**
     * Add two numbers.
     *
     * @param a first number
     * @param b second number
     * @return  sum
     */
    public static int sum(int a, int b) {
        return a+ b;
    }

    /**
     * Check whether the number is even.
     *
     * @param number the number to check
     * @return       true if even, false if odd
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Program entry point
     * @param args system arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(3, 2));
        System.out.println(isEven(3));

    }
}
