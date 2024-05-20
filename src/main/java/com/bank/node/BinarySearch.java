package com.bank.node;

public class BinarySearch {

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Keep searching until the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // find the middle index of the link
            int mid = left + (right - left) / 2;

            // Check if the target is equal to the number at the middle index
            if (nums[mid] == target) {
                return mid; // Return the index if found
            } else if (nums[mid] < target) {
                // If the target is greater than the number at the middle index,
                // move the left pointer to the right of the middle index
                left = mid + 1;
            } else {
                // If the target is less than the number at the middle index,
                // move the right pointer to the left of the middle index
                right = mid - 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();

        // Example 1
        int[] nums1 = {1, 2, 6, 3, 4, 5, 6};
        int target1 = 6;
        System.out.println("Example 1:");
        int result1 = search.binarySearch(nums1, target1);
        System.out.println("Index of " + target1 + " in nums1: " + result1);

        // Example 2
        int[] nums2 = {};
        int target2 = 1;
        System.out.println("Example 2:");
        int result2 = search.binarySearch(nums2, target2);
        System.out.println("Index of " + target2 + " in nums2: " + result2);

        // Example 3
        int[] nums3 = {7, 7, 7, 7};
        int target3 = 7;
        System.out.println("Example 3:");
        int result3 = search.binarySearch(nums3, target3);
        System.out.println("Index of " + target3 + " in nums3: " + result3);
    }
}

