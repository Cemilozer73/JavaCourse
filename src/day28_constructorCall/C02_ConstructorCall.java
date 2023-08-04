package day28_constructorCall;

public class C02_ConstructorCall {


    /*
        java'da bir constructor'in icinde baska bir constructor'i cagirmamiz gerekebilir
        bu durumda
        C02_ConstructorCall(4);  yazarsak,
        Java bunu cons. call olarak degil, method call olarak kabul eder

        Eger bir constructor'in icinden baska bir constructor cagirmamiz gerekirse
        ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir
     */

    C02_ConstructorCall (){
        System.out.println("Parametresiz constructor calisti");
    }

    C02_ConstructorCall(String str){// 3-J

        this(11);// 4 - J constructor call

        C02_ConstructorCall(4); // 8-J method call
        System.out.println("String parametreli constructor calisti");//12-J
    }//13-J

    C02_ConstructorCall(int a){// 5-J
        System.out.println("int parametreli constructor calisti");// 6-J
    }//7-J

    static void C02_ConstructorCall(int sayi){//9-J
        System.out.println("int parametresi olan method calisti"); // 10-J
    } // 11-J

    public static void main(String[] args) {//1-J Java ilk once main methoda gelir
        // kod okuma sorularında;
        // 1-Niye bu yazılmıs diye kafaya takmiyoruz
        // 2- Simdi neresi calısir
        // 3- Konsolda ne görürüm
        // 4- bu kod parcacigi bu class ne is yapar bunlara bakiyoruz
        C02_ConstructorCall obj1 = new C02_ConstructorCall("Merhaba Televole");// 2-J
        // 14-J Bitti...

        // new C02_ConstructorCall(4);  // new yazarsak constructor
        // C02_ConstructorCall(4); // method
        /*
        int parametreli constructor calisti
        int parametresi olan method calisti
        String parametreli constructor calisti
         */
    }
}