package org.jsp;

public class CountStrong {
    public static void main(String[] args) {
        int totalsum = 0;
        for(int n = 1; n <= 1000; n++) {
            if(isStrongNumber(n)) {
//                System.out.println(n);
                totalsum = totalsum + n;
            }
        }
        System.out.println(totalsum);
    }

    static boolean isStrongNumber(int n) {
        int sum = 0;
        int temp = n;

        while(temp > 0) {            // loop on temp, not n
            int digit = temp % 10;   // extract digit from temp
            int fact = isFactorial(digit);
            sum = sum + fact;
            temp = temp / 10;        // update temp
        }
        return sum == n;             // compare sum to original n
    }

    static int isFactorial(int digit) {
        int fact = 1;
        for(int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
