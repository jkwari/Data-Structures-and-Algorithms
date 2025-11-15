package Array;

import java.util.Arrays;
import java.util.HashSet;

public class revison {
    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 20;
        nums[1] = 30;
        nums[2] = 30;
        nums[3] = 34;
        nums[4] = 24;
        nums[5] = 56;

        int[] numbers = { 1, 2, 1 };
        // System.out.println(findMax(nums));
        // System.out.println(isPalindrome(numbers));
        // System.out.println(Arrays.toString(reverseArray(nums)));
        // rotateArray(2, nums);
        // printArray(nums);
        System.out.println(findDuplicates(nums));

    }

    // maximum element Time Complexity is O(N) and Space complexity is O(1)
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    // reverse Array: Time complexity is O(N) and Space Complexity is O(N)

    public static int[] reverseArray(int[] nums) {
        int[] revNums = new int[nums.length];

        int counter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            revNums[counter] = nums[i];
            counter++;
        }
        return revNums;
    }

    // IsPalindrome Time Complexity is O(N) and Space Complexity is O(1)
    public static boolean isPalindrome(int[] nums) {
        int fCounter = 0;
        int lCounter = nums.length - 1;

        while (fCounter < lCounter) {
            if (nums[fCounter] != nums[lCounter]) {
                return false;
            }
            fCounter++;
            lCounter--;
        }
        return true;
    }

    public static void rotateArray(int k, int[] nums) {
        if (k == 0 || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int temp = nums[n - 1];
        for (int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
        rotateArray(k - 1, nums); // recursive call
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }

    public static boolean findDuplicates(int[] arr) {
        // we can use hashset since hash set only stores unique elements in the
        // hash set but the space complexity will be O(N) since we are using hash set

        HashSet<Integer> elemIntegers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (elemIntegers.add(arr[i]) != true) {
                return true; // there is duplicate
            }
        }
        return false; // No duplicate
    }

}
