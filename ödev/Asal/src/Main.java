import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner girdi=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=girdi.nextInt();
        if (2<=sayi){
            System.out.println("2");
        }

        for (int i=2;i<sayi;i++){
            for (int s=2;s<i;s++){
                if (i%s !=0){

                }else break;
                while (i%2!=0 && s+1==i){
                    System.out.println(i);
                    s++;
                }
            }
        }
    }
}