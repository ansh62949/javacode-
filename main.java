
// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int [][] arr= new int[3][3];
//         // for(int i= 0;i<arr.length;i++){
//         //     for(int j = 0;j<arr.length;j++){
//         //         arr[i][j]=sc.nextInt();
//         //     }
//         // }
//         // for(int i = 0;i<arr.length;i++){
//         //     for(int j = 0 ;j<arr.length;j++){
//         //         System.out.println(arr[i][j]);
//         //     }
//         // }
//         Array list<Integer> arr = new Arraylist<>(10);


//     }
// }
class main{
    static int dataTypeSize(String str) {
        // code here
        switch (str){
            case "Character" :
                return 1;
            case "Integer":
                return 4;
            case "Float":
                return 4;
             case "Double":
                return 8;
             case "Long":
                return 8;
            default:
            return -1;
        }
    }
}