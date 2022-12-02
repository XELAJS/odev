import java .util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        double boy= girdi.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        double kilo= girdi.nextDouble();
        double vki=kilo/(boy*boy);
        if (vki<25 && vki>0){
            System.out.println("Vücut kitle endeksiniz "+vki+ " kilolu değilsiniz.");
        } else if (vki>25) {

            System.out.println("Vücut kitle endeksiniz "+vki+" kilolusunuz");
        }else System.out.println("Girdiğiniz değerleri kontrol ediniz.");
    }
}