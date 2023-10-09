public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)){
                System.out.println(s);
            }
        }
    }
    public static String reverse(String x){
        String y="";
        for (int i=x.length()-1; i>-1; i--){
            y=y+x.charAt(i);
        }
        return y;
    }

    public static boolean isPalindrome(String s){
        String q = reverse(s);
         boolean result = false;
        if (q.equals(s)){
            result = true;
        }
        return result;
    }
}