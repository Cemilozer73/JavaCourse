package day29_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int sayi = 10;

        /*
            Verilen sayiyi sasgidaki kriterlere gore degistiren
            bir method olusturun

            -eger sayi çiftse 2 katina cikarin
            - eger sayi tek ise 5 ekleyin
         */
        System.out.println("Method call'dan once sayi : "+sayi);
        sayi = sayiyiDegistir(sayi);
        System.out.println("Method call'dan sonra sayi : "+sayi);
    }

    public static int sayiyiDegistir(int sayi){

        if (sayi%2 == 0){
            return 2*sayi;
        }else {
            return sayi+5;
        }

    }
}
