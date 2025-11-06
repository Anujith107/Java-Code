import java.util.*;

public class oddnumber{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        long n=ip.nextLong();
        long sum=0;
        ip.close();

        for(int i=1;i<2*n;i++)
        {
            if(i%2==1)
            sum=sum+i; //sum+=i;
            
        }
        System.out.println(sum);
    }
}
