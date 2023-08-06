package day28_constructorCall;


public class C01_ConstructorCall {
    /*

       CONSTRUCTOR CALL ÖNEMLİ NOTLAR:

       1-) Main Method'un icinde constructor olusturmak icin "new ClassIsmi(ilgili argument)" seklinde constructor'ı yazabiliriz.
       2-) Main Method'un icinde Method yazmak icin direk ismini yazabiliyoruz. ===> "ClassIsmi(ilgiliargument)" Methodu'dur diyebiliriz.
       3-) Bir constuctor'ın icinde constructor call yapmak istersek bunun 2 şartı vardır:
           1. this() şeklinde yazıp varsa parametresini parantez içinde belirtirsek
              ilgili constructor'ı çalıştırmak üzere çağırırız.
           2. Birde this() constructor'ın içinde sadece ilk satırda yazılmalıdır.
              Sonraki satırlar için cte hatası verir.
              Bu nedenle de bir constructor'ın içinde birden fazla constructor call yapilamaz.
       4-) Eğer constructor'ın içinde ClassIsmi(ilgiliargument) seklinde bir call yapılmışsa bu Method Call'dur demeliyiz.

      */
    C01_ConstructorCall(){
        System.out.println("Parametresiz constructor calisti");
    }

    C01_ConstructorCall(String str){//3.-
        C01_ConstructorCall(4);//4.- //method call dır.Method ismi kucuk isimle yazılmalıydı
                                    // ancak Java bu durumu gormezden gelir

        // Bir constructor icinden baska bir constructor'i ihtiyac varsa cagirmak
        // icin costructor call kullanilir.
        // Constructor calisir gelmez, constructor calisti deriz.
        System.out.println("String parametreli constructor calisti");//8.-
    }//9.

    C01_ConstructorCall(int a) {
        System.out.println("int parametreli constructor calisti");
    }

    void C01_ConstructorCall(int sayi){ //5.- // Bu bir methodtur.Cunku void return type vardir.
        System.out.println("int parametresi olan method calisti");//6.-
    }//7.-
    public static void main(String[] args) {//1-Java ilk buradan calismaya baslar
        // bir tana obje olusturalim
        C01_ConstructorCall obj1 = new C01_ConstructorCall("Merhaba Televole"); //(2-Java buradan başlar)
        // Bu tur durumlarda Java evvela main methodtan calismaya baslar.
        // 2.olarak C01_ConstructorCall obj1 = new C01_ConstructorCall(); gececek
        //bu constructor parametresiz oldugu icin 3. olarak java ilk constructor'u sececektir.
        //System.out.println("Parametresiz constructor calisti"); 4. olarak yazdıracaktır


//10.- olarak burası son.

        // konsol da:int parametresi olan method calisti
                   //String parametreli constructor calisti yazdirir.
    }

}
