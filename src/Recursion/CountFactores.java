package Recursion;

public class CountFactores {

    public static void main(String[] args) {

        int n = 10;
        int i = 1;
        int count = 0;

        System.out.println("Number of factors = " + countfact(n, i, count));
    }

    private static int countfact(int n, int i, int count) {

        // Base condition
        if (i > n)
            return count;

        // Check whether i is a factor
        if (n % i == 0)
            count++;

        // Recursive call
        return countfact(n, i + 1, count);
    }
}