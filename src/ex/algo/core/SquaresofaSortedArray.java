package ex.algo.core;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        sortedSquares(new int[]{-7,-3,2,3,11});
    }

    public static int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int lastIndex = A.length-1;
        while(left<=right){
            int leftNum = A[left]*A[left];
            int rightNum = A[right]*A[right];
            if(leftNum<=rightNum){
                squares[lastIndex] = rightNum;
                right--;
            } else {
                squares[lastIndex] = leftNum;
                left++;
            }
            lastIndex--;
        }
        return squares;
    }
}
