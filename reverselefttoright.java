import java.util.*;

public class reverselefttoright {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        
        int num=ip.nextInt();
        int rev=0,dig;
        ip.close();

        while(num!=0)
        {
            dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        System.out.println(rev);

    }
    
}
