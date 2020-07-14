package ex.algo.core;

public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(23));
        System.out.println(isHappy(12));
    }

    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = square(slow); // move one step
            fast = square(square(fast)); // move two steps
        } while (slow != fast); // found the cycle

        return slow == 1; // see if the cycle is stuck on the number '1'
    }

    public static int square(int n){
        int sqr = 0;
        while(n!=0){
            int dig = n%10;
            sqr += dig*dig;
            n/=10;
        }
        return sqr;
    }
}
