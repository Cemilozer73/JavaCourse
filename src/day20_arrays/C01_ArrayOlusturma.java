package day20_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int[] sayılar = {2,4,6,7,8};

        String harfler[] = {"a","f","e"};

        System.out.println(sayılar[1]); // 4
        System.out.println(harfler[2]); // e


        String[] ogrenciList = {"Burhan","Ramazan", "Samat","Senol"};
        System.out.println(ogrenciList[1]); // Ramazan

        // 5 kişilik sinif olusturun

        String[] sinifListesi1 = {null, null, null, null, null}; // sinif listesi boyle olusturulacagi gibi
                                                                // asagida yazildigi gibi daha uygun bir sekilde
                                                                // olusturulabilir.
        String[] sinifListesi2 = new String[5]; //  5 kisilik yeni bir array olusturmus olduk.

        /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- İcine konulacak datalarin turu
            2- Array'in uzunlugu (Bir array'e olusturulurken yazilan uzunlugundan
                                    daha fazla element konulamaz)
                                    orn:sinifListesi = new String[5]; 5(bes) elemente ekleme yapamayiz.
         */

        // bir array'in tumunu nasil yazdirabiliriz ?

        System.out.println(sayılar); // 2,4,6,7,8 olması gerikirken [I@75bd9247 seklinde yazdirdi.

        // dongu ile yazdiralim
        // 0'ıncı indexten baslayip sayilarin  length sine kadar gidecek
        for (int i = 0; i < sayılar.length; i++) {
            System.out.print(sayılar[i] + " ");
            // sayilar in i'inci indexteki elementi yazdirsin ve bir bosluk biraksin
        }   // 2 4 6 7 8 bu array degil ve uzun iş mantikli değil
        System.out.println(""); // bir alt satira gecmesi icin.

        // Array'in tamamini yazdirmak isterseniz
        // Arrays class'indan hazir method kullaniriz

        System.out.println(Arrays.toString(sayılar)); // [2, 4, 6, 7, 8]

        // for loop ile elementleri yazdiririz.
        // Arrays.toString() ise bize array'in kendisini yazdirir

        System.out.println(Arrays.toString(harfler)); // [a, f, e]

        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] bllist = new boolean[8];
        System.out.println(Arrays.toString(bllist)); // [false, false, false, false, false, false, false, false]


    }
}
