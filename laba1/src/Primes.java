public class Primes {
    public static void main(String[] args) {
        for (int i=3; i<=100; i++){
            if (IsPrime(i)){
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }

    public static boolean IsPrime(int n){
        boolean result=false;
        for (int i=2; i<n; i++){
            if (n%i==0){
                result=false;
                break;
            } else result = true;
        }
        return result;
    }
}