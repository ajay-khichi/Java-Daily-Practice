
import java.util.Scanner;

public class AAB_PrimeNum {
    public static void main(String[] args) {
        int num,temp;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        temp=num;
        for (int i = 2; i < num; i++) {
         if(num==2) {
            break;
         }
         if(num%i==0){
            System.out.println(i);
            num=num/i;
            break;
         }
        }
        if(temp==num && temp!=1 && temp!=0){
            System.out.println(temp + " is prime");
        }
        else{
            System.out.println(temp + " is not prime");
        }
    }
}
