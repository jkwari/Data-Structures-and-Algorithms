package Array;

import java.util.Arrays;
import java.util.HashSet;

public class ArrImplementation {

    public ArrImplementation() {
        System.out.println("Here the results of running these Methods");
    }

    // Find the MAX Element in an Array Time Complexity is O(N) Because the
    // For loop might loop through the entire array to find the Max;
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Find the MIN Element in the Array Time Complexity is O(N) Because the
    // For loop might loop through the entire array to find the Min;;
    public int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Reverse an Array:
    public int[] reverseArray(int[] nums) {
        int[] reverse = new int[nums.length];
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            reverse[j] = nums[i];
            j++;
        }
        return reverse;
    }

    // Reverse an array in place:
    public int[] reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int placeHolder;
        while (left < right) {
            placeHolder = arr[left];
            arr[left] = arr[right];
            arr[right] = placeHolder;
            left++;
            right--;
        }
        return arr;
    }

    // Rotate an Array by position K

    public int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // Reverse the entire Array
        arr = reverseArray(arr, 0, n - 1);
        // Reverse the beginning of the array till k
        arr = reverseArray(arr, 0, k - 1);
        // Reverse the remaining of the array from k till the end
        arr = reverseArray(arr, k, n - 1);

        return arr;
    }

    private int[] reverseArray(int[] arr, int start, int end) {
        int placeHolder;
        while (start < end) {
            placeHolder = arr[start];
            arr[start] = arr[end];
            arr[end] = placeHolder;
            start++;
            end--;
        }
        return arr;
    }

    // Check if an Array is Palindrome or Not:
    public boolean isPalindrome(int[] arr) {
        int firstCounter = 0;
        int lastCounter = arr.length - 1;
        for (; firstCounter < arr.length / 2; firstCounter++) {
            if (arr[firstCounter] != arr[lastCounter]) {
                return false;
            }
            lastCounter--;
        }
        return true;
    }

    // Find Duplicate Elements in the Array Brute Force Approach:
    public boolean duplicateElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Find duplicates using HashSet, Hash set is used to store
    // UNIQUE elements (NO DUPLICATION) so our goal is to put all the
    // data in the array in the HashSet: HERE IS MY CODE

    public boolean findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) != true) {
                // Means that there is a duplicate
                return true;
            }
        }
        // Means No Duplicates in the nums array
        return false;
    }

    // Missing number Sequence:
    public int missingNumberSequence(int[] arr) {
        // i put +1 in the arr.length because i want to start from 1 not from 0
        int counter = arr.length + 1;
        // We use this equation when our questions are about
        // (Sequence of consecutive numbers, anything about Missing Numbers,
        // and input that has all numbers except one )
        // It is called the Gauss's formula
        int expectedSum = counter * (counter + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        return expectedSum - actualSum;
    }

    // Using two pointers
    public boolean pairSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        boolean flag = false;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                flag = true;
                break;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;

            }

        }
        return flag;
    }

    // Solving it using Hashset
    public boolean pairSumHashSet(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            // As we scan the array we check if the result (target-num) is in
            // the set:
            // if "yes" then found the pair which is the result and the num;
            // If "No" then we didn't find it so we add it to the set.

            result = target - num;

            if (set.contains(result)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // Maximum SubArray problem (Brute Force)
    public int findMaximumSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // Start with the smallest Number Possible.
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

}
