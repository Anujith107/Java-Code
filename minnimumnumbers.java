import java.util.Scanner;

public class minnimumnumbers {
    public static void main(String[] args){

        Scanner ip=new Scanner(System.in);
        long num1=ip.nextLong();
        long num2=ip.nextLong();
        long min;

        if(num1<num2)
        {
            min=num1;
        }
        else{
            min=num2;
        }

        System.out.printf("minimuum of %d and %d is %d",num1,num2,min);
        ip.close();
    }
    
}
