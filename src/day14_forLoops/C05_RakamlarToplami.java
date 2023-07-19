package day14_forLoops;

import java.util.Scanner;

public class C05_RakamlarToplami {
    public static void main(String[] args) {

        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarini toplamak uzere pozitif bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        int sayi = girilenSayi; //1453
        int birlerBasamagi = 0;
        int rakamlartoplami = 0;

        // integer olduğu için String'teki gibi lenght ile uzunluğu öğrenemeyiz
        // bunun için int'i Stringe ( int basamakSayisi = (sayi + "").lenght())
        // şeklinde çeviririz. kısace String lenght'in açılması için
        // int xxx=(sayi+ hiçlik yani iki "" çift tirnak yazilir.

        int basamakSayisi = (sayi+"").length();  // 1453 için 4

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi = sayi % 10;
            rakamlartoplami +=birlerBasamagi;
            sayi /=10;

        }

        System.out.println("Girilen " + girilenSayi +" sayisinin rakamlar toplami : " + rakamlartoplami);
    }
}
