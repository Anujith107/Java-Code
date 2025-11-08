import java.util.*;

public class righttoleftsplit{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        int div=1;
        int copynum=num;
        int dig;
        ip.close();

        //calculate the divisor
        while(num>=10)
        {
            num=num/10;
            div=div*10;
        }
        while(copynum!=0)
        {
            dig=copynum/div;                     
            System.out.println(dig+"");         
            copynum=copynum%div;               
            div=div/10;
        }

        
    }
}
