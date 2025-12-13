public class XPattern{
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(col-row == 0 || row+col == n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Output:
// *   *
//  * *
//   *
//  * *
// *   *
// This is the X Pattern where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = col - row == 0 || row + col == n + 1