
// print numbers from n to 1
package RECURSION;

import java.util.*;

public class first {

    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        printNumb(n);

    }

}
