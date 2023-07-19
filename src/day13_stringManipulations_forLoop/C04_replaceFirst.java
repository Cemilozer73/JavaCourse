package day13_stringManipulations_forLoop;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Java Candir, kendisini cok seviyoruz123.";

        // Sadece ilk a'yi BUYUK  A yapin

        System.out.println(str = str.replaceFirst("a", "A"));
        //JAva Candir, kendisini cok seviyoruz123.

        // ilk space'i iki space haline getirin

        System.out.println(str.replaceFirst(" ", "  "));

        //JAva  Candir, kendisini cok seviyoruz123.

        // ilk sayiyi space haline donusturun

        System.out.println(str.replaceFirst("\\d", " "));
        // JAva Candir, kendisini cok seviyoruz 23.

        // ilk ozel karakteri * olarak degistirin

        System.out.println(str.replaceFirst("\\W", "*"));
        //JAva*Candir, kendisini cok seviyoruz123.

        System.out.println(str.repeat(3));
        // JAva Candir, kendisini cok seviyoruz123.JAva Candir, kendisini cok seviyoruz123.
        // JAva Candir, kendisini cok seviyoruz123.
    }

}
