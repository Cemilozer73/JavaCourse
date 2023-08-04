package day28_constructorCall;

public class C01_ConstructorCall {
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
