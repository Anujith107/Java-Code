import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        ip.close();
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.println(i);
        }


    }
}
