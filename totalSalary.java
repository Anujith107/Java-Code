import java.util.*;

class totalSalary{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        int bs=ip.nextInt();
        float gross;

        if(bs > 0 && bs <= 10000){
            gross=bs+(bs*0.2f)+(bs*0.8f);
            System.out.printf("Rs.%.0.2f",gross);
        }
        else if(bs>10000&&bs<=20000){
            gross=bs+(bs*0.25f)+(bs*0.9f);
            System.out.printf("Rs.%.0.2f",gross);
        }
        else if(bs>20000){
            gross=bs+(bs*0.3f)+(bs*0.95f);
            System.out.printf("Rs.%.0.2f",gross);
        }

        ip.close();
        
    }

}
