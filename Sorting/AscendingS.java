public class AscendingS{
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}

/*
Time and Space Complexity Analysis for Selection Sort:

Time Complexity:
- Best Case:    O(n^2)   → Still compares all pairs even if already sorted.
- Average Case: O(n^2)   → Nested loops go through all elements.
- Worst Case:   O(n^2)   → No optimization; always n(n-1)/2 comparisons.

Space Complexity:
- O(1)                  → In-place sorting algorithm; uses constant extra space.
*/
