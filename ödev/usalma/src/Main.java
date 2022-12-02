import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.println("1.Sayı üssü alma.");
        System.out.println("2.Kesirli sayı üssü alma");
        System.out.print("Yapmak istediğiniz işlemi seçiniz(Baştaki sayıyı girin.):");
        int secim= girdi.nextInt();
        if (secim==2){
            System.out.print("Payı giriniz:");
            double pay= girdi.nextDouble();
            System.out.print("Paydayı giriniz:");
            double payda= girdi.nextDouble();
            if (payda==0){
                System.out.println("Payda 0 olamaz.");
                System.exit(1);
            }else{
                System.out.print("Almak istediğiniz üssü giriniz:");
                int kuvvet= girdi.nextInt();
                double payKuvvet=1;
                for (int i=0;i<kuvvet;i++){
                    payKuvvet=payKuvvet*pay;
                }
                double paydaKuvvet=1;
                for (int i=0;i<kuvvet;i++){
                    paydaKuvvet=paydaKuvvet*payda;
                }
                System.out.println(pay+"/"+payda+" üssü "+kuvvet+"="+payKuvvet+"/"+paydaKuvvet);
            }
        } else if (secim==1) {
            System.out.print("Üssü alınacak sayıyı girin:");
            double sayi= girdi.nextDouble();
            System.out.print("Kaçıncı kuvvetini almak istersiniz:");
            int us= girdi.nextInt();
            double carpim=1;
            if(us<0){
                for(int i=0;i>us;i--){
                    carpim=carpim*sayi;
                }
                System.out.println(sayi+" üssü "+us+"=1/"+carpim);
                return;
            } else if (us==1) {
                System.out.println(sayi+" üssü "+us+"="+sayi);

            }else if(us==0){
                System.out.println(sayi+" üssü "+us+"=1");
            }else{
                for (int i=0;i<us;i++){
                    carpim=sayi*carpim;
                }
                System.out.println(sayi+" üssü "+us+"="+carpim);
            }





        }else System.out.println("Lütfen geçerli bir değer giriniz.");

    }
}