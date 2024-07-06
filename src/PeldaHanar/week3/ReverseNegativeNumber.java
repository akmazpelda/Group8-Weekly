package PeldaHanar.week3;

public class ReverseNegativeNumber {
    public static int reserveNegative(int num) {

        if (num >= 0) {
            throw new IllegalArgumentException("input number must be negaative");
        }
            int positiveNum = -num;
            int reversedNum = 0;


            while (positiveNum != 0) {
                int digit = positiveNum % 10; // Get the last digit
                reversedNum = reversedNum * 10 + digit;
                positiveNum /= 10;
            }
       return reversedNum;
        }

    public static void main(String[] args) {
        int input = -35;
        int output = reserveNegative(input);
        System.out.println("input:" + input + "Output:" + output);
    }

}