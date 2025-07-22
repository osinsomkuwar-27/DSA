public class Subarrays {

    // This method prints all possible subarrays from the given array
    public static void printsub(int nums[]) {
        int ts = 0; // ts = total subarrays

        // Outer loop for the starting index of subarray
        for (int i = 0; i < nums.length; i++) {
            int start = i;

            // Middle loop for the ending index of subarray
            for (int j = i; j < nums.length; j++) {
                int end = j;

                // Inner loop to print elements from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                }

                ts++; // Increment total subarray count
                System.out.println(); // Move to next line after printing one subarray
            }

            System.out.println(); // Optional: blank line for better separation
        }

        // Print total number of subarrays found
        System.out.println("Total Subarrays: " + ts);
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10}; // Input array
        printsub(nums); // Call the method to print subarrays
    }
}

/*
Time and Space Complexity Analysis:

Time Complexity:
- O(n^3)     → 
    Outer loop (i) runs n times,
    Middle loop (j) runs up to n times,
    Inner loop (k) runs up to n times in worst case (to print subarray).
    So total = O(n^3)

Space Complexity:
- O(1)       → Only a few variables used for looping (constant space).
*/
