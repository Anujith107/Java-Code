import java.util.*;

public class print{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        ip.close();
        int div=1;
        int copynum=num;
        int dig;

        //calculate the divisor
        while(num>=10)
        {
            num=num/10;
            div=div*10;
        }
        while(copynum!=0)
        {
            dig=copynum/div;                     
            if(dig==2||dig==3||dig==5||dig==7)  
            {
                System.out.println(dig);
            }       
            copynum=copynum%div;               
            div=div/10;
        }
    }
}