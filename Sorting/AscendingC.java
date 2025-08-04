public class AscendingC{
//this sort is mostly for positive numbers and works well when the range of input values is not significantly larger than the number of elements to be sorted.
    public static void CountingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        //sorting
    int j = 0;
    for(int i = 0; i < count.length; i++){
        while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        CountingSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
/*
Time and Space Complexity Analysis for Counting Sort:

Time Complexity:
- Best Case:    O(n + k)   → Counting and placement done efficiently.
- Average Case: O(n + k)   → Same as best and worst; data-driven performance.
- Worst Case:   O(n + k)   → n = number of elements, k = range of input values.

Space Complexity:
- O(k + n)              → Uses extra space for count array (size k) and sometimes output array (size n).

Notes:
- Efficient when k (the range of input) is not significantly larger than n.
- Not suitable for negative numbers unless modified.
- Stable sorting algorithm (if implemented using output array).
*/
