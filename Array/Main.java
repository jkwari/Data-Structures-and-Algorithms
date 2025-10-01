package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello From VSCode");
        ArrImplementation arr = new ArrImplementation();
        int[] numbers = { 1, 2, 3, 5 };
        // System.out.println("Maximum Element: " + arr.findMax(numbers));
        // System.out.println("Minimum Element: " + arr.findMin(numbers));
        // int[] reveredArr = arr.reverseArray(numbers);
        // System.out.println("Revered Array: [" + Arrays.toString(reveredArr) + " ]");
        // System.out.println("Is this Array Palindrome: " + arr.isPalindrome(numbers));

        // int[] reverseInPlace = arr.reverseInPlace(numbers);
        // int[] rotatedArray = arr.rotateArray(numbers, 2);
        // System.out.println("Reverse an Array in Place: [" +
        // Arrays.toString(reverseInPlace) + "]");
        // System.out.println("Rotate an Array in Place: [" +
        // Arrays.toString(rotatedArray) + "]");
        // System.out.println("Is there duplicate Elements? : " +
        // arr.findDuplicate(numbers));
        // System.out.println("What is the missing number in the sequence: " +
        // arr.missingNumberSequence(numbers));
        System.out.println("Can we find the target 10 in this array: " + arr.pairSum(numbers, 6));
    }
}