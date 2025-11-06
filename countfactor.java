import java.util.Scanner;

public class countfactor{
    public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int count=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count=count+i;
        }
        System.out.println(count);
    }
}
