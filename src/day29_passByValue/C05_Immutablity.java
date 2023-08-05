package day29_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C05_Immutablity {

    /*
    Java String'i olustururken immutable(degismez, sabit) olusturmustur.
         Ancak List'i olustururken mutable (degisken, degisebilir) olusturmustur.
     */

    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.toUpperCase()); // JAVA CANDİR


        str.replace("a","*");

        str.split("");

        System.out.println(str); // Java Candir
        // String'de atama yoksa, calistirilan methodlar asil variable'i kalici olarak degistirmez

        List<String> isimler = new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Omer");
        isimler.add("Bugra");

        System.out.println(isimler); //[Kaan, Omer, Bugra]

        isimler.set(1,"Ozan");
        System.out.println(isimler); // [Kaan, Ozan, Bugra]

        isimler.remove(1);
        System.out.println(isimler); // [Kaan, Bugra]
    }
}
