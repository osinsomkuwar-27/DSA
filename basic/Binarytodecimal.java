public class Binarytodecimal{
    public static void bintodec(int n){
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int lastDigit = n%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal number of the given number is: " + decNum);
    }
    public static void main(String[] args) {
        bintodec(0111111);
    }
}