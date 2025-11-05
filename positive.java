import java.util.Scanner;

public class positive {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();

        if(num>0)
        {
            System.out.println("positive");
        }
        else if(num<0)
        {
            System.out.println("Negative");

        }
        else{
            System.out.println("Zero");
        }

        ip.close();
    }
    
}
