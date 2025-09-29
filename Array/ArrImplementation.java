package Array;

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

}
