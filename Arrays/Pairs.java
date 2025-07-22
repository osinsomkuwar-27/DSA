public class Pairs {

    // This method prints all possible pairs from the array
    public static void printpairs(int nums[]) {
        int tp = 0; // tp stands for total pairs

        // Outer loop to pick the first element of the pair
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i]; // Store the current element

            // Inner loop to pair current element with the rest of the elements
            for (int j = i + 1; j < nums.length; j++) {
                // Print the pair (current, next element)
                System.out.print("(" + current + "," + nums[j] + ")");
                tp++; // Increase total pair count
            }
            System.out.println(); // New line after each i's set of pairs
        }

        // Print the total number of pairs
        System.out.println("Total pairs are: " + tp);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // Input array
        printpairs(nums); // Call the method to print pairs
    }
}

/*
Time and Space Complexity Analysis:

Time Complexity:
- O(n^2)     → Two nested loops: outer loop runs n times, inner runs up to (n-1) times.

Space Complexity:
- O(1)       → No extra space used except a few variables (constant space).
*/
