import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.print("Ayı giriniz:");
        String ay= girdi.next();
        switch (ay.toLowerCase()){
            case("aralık"):
            case("aralik"):
            case("ocak"):
            case("şubat"):
                System.out.println("Kış");
                break;
            case("mart"):
            case("nisan"):
            case("nısan"):
            case("mayıs"):
            case("mayis"):
                System.out.println("İlkbahar");
                break;
            case("haziran"):
            case("hazıran"):
            case("temmuz"):
            case("ağustos"):
                System.out.println("Yaz");
                break;
            case("eylül"):
            case("ekim"):
            case("ekım"):
            case("kasım"):
            case("kasim"):
                System.out.println("Sonbahar");
            break;


        }

    }
}