
public class Linearsearch {
    public static int linearsearch(int numbers[], int key) {
        
        // Loop to iterate through the entire array one by one
        for (int i = 0; i < numbers.length; i++) {
            // If the ith element matches the key we return its index i.e i
            if (numbers[i] == key) {
                return i;
            }
        }
        // If the key is not found we return -1 (also as we have declared the return type of our function int thats why we are returning -1)
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        
        // Calling the linearsearch method and storing the result (index)
        int index = linearsearch(numbers, key);

        // Checking if the element was found or not
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
- Best Case: O(1)       → Key is at the first index.
- Worst Case: O(n)      → Key is at the last index or not present.
- Average Case: O(n)    → Key is somewhere in the middle.

Space Complexity:
- O(1)                  → Constant space is used (no extra memory used).
*/