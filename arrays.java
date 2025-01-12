import java.util.*;

public class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        // Input for the second array
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int j = 0; j < a2.length; j++) {
            a2[j] = sc.nextInt();
        }

        // Resultant difference array
        int[] diff = new int[n2];
        int c = 0; // Carry

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        // Calculate the difference
        while (k >= 0) {
            int a1v = i >= 0 ? a1[i] : 0; // Handle unequal lengths
            int d;

            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // Skip leading zeros
        int index = 0;
        while (index < diff.length && diff[index] == 0) {
            index++;
        }

        // Print the result
        if (index == diff.length) {
            System.out.println(0); // Case when the result is 0
        } else {
            while (index < diff.length) {
                System.out.println(diff[index]);
                index++;
            }
        }
    }
}
