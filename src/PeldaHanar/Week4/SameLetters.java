package PeldaHanar.Week4;

import java.util.Arrays;
public class SameLetters {
    public static boolean same(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println("Are the strings built out of the same letters? " + same(str1, str2));

        str1 = "abc";
        str2 = "abb";
        System.out.println("Are the strings built out of the same letters? " + same(str1, str2));
    }
}
