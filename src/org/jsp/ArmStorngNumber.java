package org.jsp;

public class ArmStorngNumber {
    public static void main(String[] args) {
        int n = 153;
        boolean res = isArmStrong(n);

        if (res)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    static boolean isArmStrong(int n) {
        int original = n;         
        int temp = n;
        int countDigit = 0;
        int sum = 0;

        
        while (temp > 0) {
            countDigit++;
            temp = temp / 10;
        }

        temp = original;          

        // Calculate sum of digitscountDigit
        while (temp > 0) {
            int digit = temp % 10;
            int p = 1;
            for (int i = 1; i <= countDigit; i++) {
                p = p * digit;
            }
            sum += p;
            temp = temp / 10;
        }

        return sum == original;   // Return true/false
    }
}
