//Half-pyramid pattern - Counting triangle

public class Counttriangle1{
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if(row >=col){
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
}

// Output:
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// This is the counting triangle pattern where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = row >= col