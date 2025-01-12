package RECURSION;

public class factorial {

    public static int fact(int n) {

        if (n == 1) {

            return 1;
        }

        int fact_num1 = fact(n - 1);
        int fact_n = n * fact_num1;
        return fact_n;

    }

    public static void main(String args[]) {
        int n = 5;
        int m = fact(n);
        System.out.println(m);

    }

}
