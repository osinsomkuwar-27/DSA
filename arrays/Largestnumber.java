public class Largestnumber{
    public static int largestnumber(int nums[]){
        int largest = Integer.MIN_VALUE;  //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0 ;i<nums.length;i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("The smallest number is:" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3,6, 4, 5};
        System.out.println("The largest number is:" + largestnumber(nums));
    }
}