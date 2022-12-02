import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.print("Yaşınızı giriniz:");
        int yas= girdi.nextInt();
        if (yas<18 && 0<yas){
            System.out.println("Yaşınıız "+yas+" reşit değilsiniz");
        } else if (yas>=18) {

            System.out.println("Yaşınıız "+yas+" reşitsiniz");

        }else System.out.println("Bir hata oluştu lütfen girdiğiniz değeri kontrol ediniz.");
    }
}