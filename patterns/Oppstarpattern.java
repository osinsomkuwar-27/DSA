//Bottom right triangle star pattern

public class Oppstarpattern{
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row+col >=n+1){
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
//     *
//    **
//   ***
//  ****
// *****
// This is the opposite right triangle star pattern where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = n - col + 1 >= row