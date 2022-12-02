import java.util.*;
public class Main {
    public static void main(String[] args) {

        Random rnd=new Random();
        Scanner girdi=new Scanner(System.in);
        int secim= rnd.nextInt(2);
        System.out.print("Hangisini söylemek istersiniz(yazı,tura:");
        String kullaniciSecimi= girdi.next();
        if (secim==1){
            if (kullaniciSecimi.toLowerCase().equals("yazı") || kullaniciSecimi.toLowerCase().equals("yazi")){
                System.out.println("Para yazı geldi kazandınız.");
            } else if (kullaniciSecimi.toLowerCase().equals("tura")) {

                System.out.println("Para yazı geldi maalesef kaybettiniz.");
            }else System.out.println("Lütfen geçerli bir şey söyleyiniz.");
        }else {
            if (kullaniciSecimi.toLowerCase().equals("yazı") || kullaniciSecimi.toLowerCase().equals("yazi")){
                System.out.println("Para tura geldi maalesef kaybettiniz.");
            } else if (kullaniciSecimi.toLowerCase().equals("tura")) {

                System.out.println("Para tura geldi kazandınız.");
            }else System.out.println("Lütfen geçerli bir şey söyleyiniz.");
        }


    }
}