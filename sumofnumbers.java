import java.util.*;

public class sumofnumbers{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0)
            sum=sum+i;

        }
        System.out.println(sum);

    }
}
