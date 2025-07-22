public class Binarysearch {

    public static int binsearch(int nums[], int key) {
        int start = 0; // Start index of the array
        int end = nums.length - 1; // End index of the array

        // Loop to search until start index is less than or equal to end index
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // If the middle element is equal to key, return its index
            if (nums[mid] == key) {
                return mid;
            }

            // If key is greater than middle element, search in right half
            if (nums[mid] < key) {
                start = mid + 1;
            }
            // If key is smaller than middle element, search in left half
            else {
                end = mid - 1;
            }
        }

        // If key is not found, return -1
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {2, 4, 6, 8, 10, 12, 14, 16}; // Sorted array
        int key = 10; // Key to be searched

        // Call the binsearch method and store the result (index)
        int index = binsearch(nums, key);

        // Check if the element was found or not
        if (index == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}

/*
Time and Space Complexity Analysis:

Time Complexity:
- Best Case: O(1)       → Key is at the middle in the first check.
- Worst Case: O(log n)  → Each step cuts the array size in half.
- Average Case: O(log n)→ Efficient even for large arrays.

Space Complexity:
- O(1)                  → Constant space is used (no extra memory).
*/
