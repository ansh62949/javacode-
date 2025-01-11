import java.util.*;
public class main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][]arr = new int[2][2];
            for(int i = 0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    arr[i][j]=sc.nextInt();
                }
                
            }
            for(int i = 0;i<arr.length;i++){
                for(int j =0;j<arr.length;j++){
                    System.out.println(arr[i][j]);

                }
               
            }
    }
}
