import java.util.*;

public class splitdigit {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        while(num!=0)
        {
            int dig=num%10;
            System.out.println(dig);
            num=num/10;
        }
    }
    
}
