import java.util.*;

public class numberoccurance {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        int target=ip.nextInt();
        int count=0;
    
        while(num!=0)
        {
            int dig=num%10;
            if(dig==target)
            {
                count++;
                num=num/10;
            }
        }
    System.out.println(count);
    ip.close();
        
        
        
    }
    
}
