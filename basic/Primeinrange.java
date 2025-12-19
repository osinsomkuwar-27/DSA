public class Primeinrange{
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        // if(n == 2){
        //     return true;
        // }
        // return false;
    }
    public static void primeinrange(int n){
        for(int i = 2; i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        primeinrange(20);
    }
}