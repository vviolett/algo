package ex.algo.core;

public class FibonacciNumber509 {
    public static void main(String[] args) {
        System.out.println(fib(4));


    }

    public static int fib(int N) {
        int num1 = 1;
        int num2 = 1;
        int res = 0;
        if(N == 1|| N==2){
            return 1;
        }

        for (int i = 2; i < N; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return res;
    }
}
