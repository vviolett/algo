package ex.algo.list;

public class Permutations {
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permute(str, 0, n-1);
    }

    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
