public class Reverse{
    public static void reversenumber(int nums[]){
        int start = 0, end = nums.length-1;
        while(start<end){
            //swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        reversenumber(nums);
        for(int i = 0; i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}