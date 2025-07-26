public class Maxsubarraysum {

    // This method implements Kadane's Algorithm to find the maximum subarray sum
    public static void kadane(int num[]) {

        // Initialize current sum (cs) and maximum sum (ms) with the first element
        int cs = num[0]; // current sum of subarray
        int ms = num[0]; // max sum found so far

        // Traverse the array starting from the second element
        for (int i = 1; i < num.length; i++) {
            // Choose the better option: start new subarray or extend previous one
            cs = Math.max(num[i], cs + num[i]);

            // Update max sum if current sum is higher
            ms = Math.max(ms, cs);
        }

        // Print the result
        System.out.println("Maximum Subarray Sum: " + ms);
    }

    public static void main(String[] args) {
        // Example input array
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        // Call the method
        kadane(num);
    }
}

/*
Time and Space Complexity Analysis:

Time Complexity:
- Best Case:    O(n)  → Even if all elements are positive, we must check each once.
- Average Case: O(n)  → One full pass through the array is always required.
- Worst Case:   O(n)  → Even with all negatives, we process every element.

Space Complexity:
- O(1)          → Only two variables used (cs and ms), no extra data structures.
*/
