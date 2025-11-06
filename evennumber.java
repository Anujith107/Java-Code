import java.util.*;

public class evennumber{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);

        int n=ip.nextInt();
        int sum =0;

        for(int i=10;i<=20;i=i+2)
        {
            if(i%2==0)
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
