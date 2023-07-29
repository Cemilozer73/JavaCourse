package day27_parametreliConstructor_constructorCall;

public class C06_ArabaRunner {
    public static void main(String[] args) {

        C05_Araba araba1 =new C05_Araba("opel",2010,4000);

        System.out.println(araba1);
        //Araba bilgileri ==> marka:'opel', model:'Model belirtilmemis',
        //                    yil:2010, fiyat:4000, renk:'Renk belirtilmemis'

        C05_Araba araba2 = new C05_Araba("Mercedes","e200",2012);

        System.out.println(araba2);
        // Araba bilgileri ==> marka:'Mercedes', model:'e200', yil:2012,
        //                     fiyat:0, renk:'Renk belirtilmemis'
    }
}
