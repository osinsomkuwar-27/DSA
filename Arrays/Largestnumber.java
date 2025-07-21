public class Largestnumber{

    public static int getlargest(int nums[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i = 0; i<nums.length; i++){
            if(largest <nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number is:"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1,8,4,2,9,4,6};
        System.out.println("Largest number is: "+getlargest(nums));
    }
}

/*
Time and Space Complexity:

Time Complexity:
- O(n) → where n is the number of elements in the array.
- Because we traverse the array only once.

Space Complexity:
- O(1) → constant space used.
- No extra space used other than a few variables.
*/