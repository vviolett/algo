package ex.algo.core;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        isPalindrome(121);

    }

    public static boolean isPalindrome(int x) {
        int pal = x;
        int rev = 0;

        while (pal != 0) {
            rev = rev*10 + pal%10;
            pal /= 10;
        }

        return x==rev;
    }
}
