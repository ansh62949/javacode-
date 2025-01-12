package RECURSION; //  print x^n

public class exponent {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = power(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;

    }

    public static void main(String args[]) {

        int x = 2, n = 5;
        int ans = power(x, n);
        System.out.println(ans);

    }

}
// in this case the height of stack is n
// to maintain height in the power of log(n) write other program named
// (exponent2)
