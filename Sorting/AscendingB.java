public class AscendingB {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
/*
Time and Space Complexity Analysis:

Time Complexity:
- Best Case:    O(n)     → Array is already sorted; only one pass with no swaps.
- Average Case: O(n^2)   → Nested loops compare and swap adjacent elements.
- Worst Case:   O(n^2)   → Array is in reverse order; maximum comparisons and swaps.

Space Complexity:
- O(1)                  → Constant space is used; sorting is done in-place.
*/
