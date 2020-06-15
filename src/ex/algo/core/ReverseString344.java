package ex.algo.core;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', 'z'};

        reverseString(str);

    }
    public static void reverseString(char[] s) {
        int j = s.length-1;
        char temp;

        for (int i = 0; i < s.length/2; i++) {
            if(i!=j) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
            }
        }
    }
}
