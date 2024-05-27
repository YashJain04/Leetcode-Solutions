class Solution {
    public double myPow(double x, int n) {

        //base cases
        if (n == 0 || x == 1) return 1;
        if (n == 1) return x;
        if (x == 0) return 0;

        //variable for storing result
        double result = 1;

        //check overflow
        //first do reciprocal of x because n is at the lowest minimum value which is below 0 therefore making n negative
        //do 1 calculation for x (exponentially growing it - this allows for the n/2, hence why it is not n--)
        //make n positive and divide n/2 (binary shift right)
        if (n == Integer.MIN_VALUE) {
            x = 1/x;
            x *= x;
            n = -1 * (n / 2);
        }

        //else if n is negative
        //get reciprocal of x
        //make n positive
        else if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }

        //while n is greater than 0
        //if n is an odd number start storing the exponential growth value of x in result
        //exponentially grow x (this allows for the n/2, hence why it is not n--)
        //divide n/2 (binary shift right)
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }

            x *= x;
            n /= 2;

            /* 
             * Test Case To Understand Exponential Growth and Binary Shift Right Operations
             * x = 2 and n = 6
             * 
             * 1st Iteration:
             * n is even
             * x : 2 * 2 = 4
             * n : 6 / 2 = 3
             * x = 4 n = 3
             * 
             * 2nd Iteration:
             * n is odd
             * result : 3 % 2 == 1
             * result *= 4 => 1 *= 4 => 4
             * x : 4 * 4 = 16
             * n : 3 / 2 = 1
             * result = 4 x = 16 n = 1
             * 
             * 3rd Iteration:
             * n is odd
             * result : 1 % 2 == 1
             * result *= 16 => 4 *= 16 => 64
             * x : 16 * 16 = 256
             * n : 1/2 = 0
             * result = 64 x = 256 n = 0
             * 
             * n is 0 so while loop ends
            */

        }

        //return result
        return result;

    }
}