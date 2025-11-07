import java.util.*;

public class countdigit{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        int count=0;
        if(num==0)
        {
            count=1;
        }
        else{
            while(num!=0)
            {
                num=num/10;
                count++;
            }
        }
        System.out.println(count);
    }                                              
}
