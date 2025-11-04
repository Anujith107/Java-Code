
import java.util.Scanner;


public class birthdayparty {
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("enter decoration cost:");
        long dec=ip.nextLong();
        System.out.println("enter gift cost:");
        long gift=ip.nextLong();
        System.out.println("enter refreshment cost:");
        long ref=ip.nextLong();
        double tot=(dec+gift+ref);
        double gp=(gift/tot)*100;
        double decp=(dec/tot)*100;
        double refp=(ref/tot)*100;
        System.out.printf("total amount:%.2f",tot);
        System.out.printf("decoration:%.2f%%",decp);
        System.out.printf("gift:%.2f%%",gp);
        System.out.printf("refreshment:%.2f%%",refp);
        ip.close();
    }
}


    
