//Bottom-left Triangle Star Pattern

public class Starpattern{
    public static void main(String[] args) {
        for(int line = 1; line<=5; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




// Output: 
// *
// **
// ***
// ****
// *****

// This is the star pattern upwards where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = line no.