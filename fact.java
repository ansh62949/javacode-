
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        
        int nfact =1;
        for(int i=1;i<=n;i++){
            nfact *=i;
            
        }
        int mfact=1;
        for(int i=1;i<=n-r;i++){
            mfact *=i;
            
        }
        int npr= nfact/mfact;
        System.out.println(n+"P"+r+"="+npr);

        //function are used to increase effiency 

        
        
      
        
        
    }
}
