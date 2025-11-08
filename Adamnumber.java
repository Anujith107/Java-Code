import java.util.*;

public class Adamnumber {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        
        int num=ip.nextInt();
        int res1=num*num;
        int rev=0,dig ;
        ip.close();
        
        while(num!=0)
        {
            dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        int res2=rev*rev;
        rev=0;
        while(res2!=0)
        {
            dig=res2%10;
            rev=(rev*10)+dig;
            res2=res2/10;
        }


        if(res1==rev)
        {
            System.out.println("Adam");
        }
        else{
            System.out.println("not Adam");
        }
        
    }
    
}
