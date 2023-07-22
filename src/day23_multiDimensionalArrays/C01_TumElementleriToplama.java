package day23_multiDimensionalArrays;

public class C01_TumElementleriToplama {

    public static void main(String[] args) {

        int[] arrTek = {3,7,1,9,2,5};
        // Bu array'in tum elementlerini toplayin denildiğinde
        // elementlerin toplamı istenildiği için önce int toplam = 0; şeklinde onu oluştururuz
        // sonra bir forloop olusturur elementlerin length ine kadar gitsin deriz.
        // 0' dan başlasin arrTek'in length'ine kadar gitsin deriz

        int toplam = 0;

        for (int i = 0; i < arrTek.length; i++) {

            // arrTek[i] nedir dersek index degistikce bize array'deki tum elementleri
            // sirasiyla getirir deriz. ForLoop ilk çalistiginda i=0; olduğunda yani arrTek=0; oldugunda
            // indexteki karsiligi int[] arrTek = {3,7,1,9,2,5}; Sifirinci index yani 3
            // forLoop döndügünde bir artirildigi icin i=1; olur ve indexte arrTek=1; karsiligi 7 olur.
            // Böylelikle forloop length in son index'i 5 rakamı dahil bize getirir.
            // Biz de her getirdigi rakami (toplamlari istenildigi icin) toplamimiza eklemek için
            // toplam += arrTek[i]; şeklinde artırma ve atama yaparak toplamimiza ekleriz.


            toplam += arrTek[i]; // loop bittiginde bütün elementleri tek tek arrTek[i]; getirmis ve
                                 //  ve sonrsinda da  toplama eklemis olacak forLoop dısinda
                                 //  yazdırdigimizda kod çalişacak ve toplami verecektir.
        }

        System.out.println("arrTek'in elementleri toplami : " + toplam);


        int[][] sayilar = {{1,2,5},{7,4},{9},{3,0,1,6,8}};

        // arr[i] inner array'leri getirir
        // arr[i][j] bize int elementleri verir
        // yani kat sayisi kadar index'e yani forLoop'a ihtiyacimiz var

        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) { // disardaki forLoop outer Array'i kontrol eder

            for (int j = 0; j < sayilar[i].length ; j++) { // icerdeki forLoop inner array'leri kontrol eder

                // sayilar[i][j] sirasiyla her bir int elementi getirir

                toplam += sayilar[i][j];

            }
        }

        System.out.println("sayilar array'inin elementleri toplami : " + toplam);


    }
}
