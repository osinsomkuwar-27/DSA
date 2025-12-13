//Top up triangle star pattern

public class Invertedstarpattern{
    public static void main(String[] args) {
        int n = 7;
        for(int line = 1; line<=n; line++){
            for(int star = 1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output:
// *******
// ******
// *****
// ****
// ***
// **
// *
// This is the inverted star pattern where lines(7) -> outer loop -> 7 times
// no. of times(inner loop) runs = n - line no. + 1