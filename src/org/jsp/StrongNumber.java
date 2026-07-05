package org.jsp;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 40585;

        if (isStrongNum(n)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    static boolean isStrongNum(int n) {
        int x = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if(sum==x) return true;
        else return false;
    }
}

