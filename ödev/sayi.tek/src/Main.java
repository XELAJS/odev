import java.util.*;
public class Main {
    public static void main(String[] args) {

       Scanner girdi=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi= girdi.nextInt();
        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çift.");
        }else System.out.println("Girdiğiniz sayı tek.");

    }
}