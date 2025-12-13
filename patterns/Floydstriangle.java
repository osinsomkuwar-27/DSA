public class Floydstriangle{
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if(row>=col){
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}

// Output:
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// This is the Floyd's triangle pattern where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = row >= col   
// and a variable count is used to keep track of the current number to be printed, incrementing it after each print.
