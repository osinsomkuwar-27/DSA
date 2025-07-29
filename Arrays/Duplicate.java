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
}