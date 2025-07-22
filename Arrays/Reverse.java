public class Reverse{

    public static void rever(int nums[]){
        int first = 0, last = nums.length - 1;
        while(first <last){
            //swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int nums []={9,4,2,6,1};
        rever(nums);
        for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}