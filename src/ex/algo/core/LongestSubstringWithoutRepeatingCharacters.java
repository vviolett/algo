package ex.algo.core;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int length = 0;
        Map<Character, Integer> distinct = new HashMap<>();
        char[] arr = s.toCharArray();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if(distinct.containsKey(arr[windowEnd])){
                windowStart = Math.max(windowStart, distinct.get(arr[windowEnd])+1);
            }
            distinct.put(arr[windowEnd], windowEnd);
            length = Math.max(length, windowEnd-windowStart+1);
        }
        return length;
    }
}
