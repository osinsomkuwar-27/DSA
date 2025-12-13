public class Characterpattern{
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int line = 1; line<=n; line++){
            for(int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

// Output:
// A
// BC
// DEF
// GHIJ
// KLMNO

// This is the character pattern upwards where lines(5) -> outer loop -> 5 times
// no. of times(inner loop) runs = line no.     
// character to print = ch and increment ch after printing
