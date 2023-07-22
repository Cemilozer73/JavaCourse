  package day23_multiDimensionalArrays;

public class C03_ArraydekiEnBuyukEnKucukSayilariyazdirma {

    public static void main(String[] args) {

        // verilen 2 katli int bir array'deki
        // en buyuk ve en kucuk sayiyi bulup yazdiran bir method olusturun

        // Önce bir method oluşturacagiz methodun döndürecek mi yoksa yazdiracak mi olarak
        // istenilip istenilmediğine bakıyoruz.Yazdiran denildiği için void kullaniyoruz.
        // public static void şeklinde adini da soruda istenilen duruma göre yaziyoruz yani
        // public static void enBuyukEnKucukYazdir(int[][] arr){ şeklinde tabi bunu main methodun dışında yapıyoruz.



        int[][] arr = {{3,6,8},{2,5,9},{1,3},{12,23,34}}; // verilen arrayslerde en kücük 1 en büyük 34 görüyoruz

        enBuyukEnKucukYazdir(arr); // asagida yaptigimiz method'u burraya  görebilmek için cagirmaliyiz
                                   // cagirmak icinde method'un ismini yazmamiz gerekir

    }


    public static void enBuyukEnKucukYazdir(int[][] arr){
            // bizden en kücük ve en buyuk sayilar istenildigi icin int olarak atama yapiyoruz.

        int enKucukSayi = arr[0][0]; // en kucuk sayiya bir deger atamamiz gerekiyor 0
        int enBuyukSayi = arr[0][0]; // en buyuk sayiya bir deger atamamiz gerekiyor 0

        // İki katli bir array oldugu icin iki katli forloop yapacagiz

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                // arr[i][j]

                if (arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }

                if (arr[i][j] > enBuyukSayi){
                    enBuyukSayi = arr[i][j];
                }

            }

        }
        System.out.println("En kucuk sayi : " + enKucukSayi);
        System.out.println("En buyuk sayi : " + enBuyukSayi);
    }
}
