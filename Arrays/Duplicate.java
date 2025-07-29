//This is the bruteforce code to find duplicate in an array
//Time Complexity: O(n^2)
public class Duplicate{
    public static boolean duplicatenumber(int arr[]){
        for(int i = 0; i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true; // Duplicate found
                }
            }
        }
        return false; // No duplicates found
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,};
        boolean result = duplicatenumber(arr);  
        if(result){
            System.out.println("Duplicate found");
        } else {
            System.out.println("No duplicates found");
        }
    }
}