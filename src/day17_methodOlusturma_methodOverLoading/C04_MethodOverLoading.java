package day17_methodOlusturma_methodOverLoading;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
     /*
        Biz bir method call yaptigimizda
        Java oncelikle method ismini kontrol eder
        Sonra argument olarak verilen degerler ile, parametre olarak
        yazilan variable'larin data turlerini karsilastirir
        ve uyumlu ise method'u calistirir
        argumentler ile parametreler uyumlu degilse CTE verir

         Java'da ayni data turune ve parametre sayisina sahip
        birden fazla method olusturamazsiniz

        farkli data turlerinde parametreler varsa
        dizilis degistirildiginde
        java farkli bir method olarak kabul eder
     */

        toplama(4,6); //İki int'in toplami : 10

        toplama(5.3,6); // double ve int2in toplami : 11.3

        toplama(5,2.4); // int ile double'in toplami : 7.4

        toplama(4.3,2.4); // double ile double'nin toplami : 6.699999999999999

        toplama(3.4f,5); // double ve int2in toplami : 8.400000095367432

        toplama(2.3f,5f); // 7.299999952316284

    }

    public static void toplama(int sayi1, int sayi2){ // method signature toplama int int

        System.out.println("İki int'in toplami : " + (sayi1+sayi2));

    }

    public static void toplama(int a,double b){ // method signature 'i int double
        System.out.println("int ile double'in toplami : " + (a+b));

    }
    public static void toplama(double b, int a){ // method signature'i double int
        System.out.println("double ve int2in toplami : " + (a+b));

    }

    public static void toplama(double sayi1 , double sayi2){ // method signature'i double double
        System.out.println("double ile double'nin toplami : " + (sayi1 + sayi2));
    }

/*
        method ismi + parametrelerin data turlerine method signature denir
        Java ayni class'da signature'i ayni olan 2 method'a izin vermez

        Bir class'da ismi ayni fakat signature'i farkli
        birden fazla method olusturulmasina METHOD OVERLOADING denir.
     */
}