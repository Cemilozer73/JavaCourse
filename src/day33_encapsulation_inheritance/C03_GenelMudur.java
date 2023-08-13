package day33_encapsulation_inheritance;

public class C03_GenelMudur {

    public static void main(String[] args) {

        C01_Pazarlama pazarlama = new C01_Pazarlama();
        System.out.println(pazarlama.getToplamSatis()); // C01 class'ındaki ToplamSatis degerine okumak icin buradan ulasabiliyoruz.

        /* C01 deki get methodu sadece okuyabiliyoruz yazamıyoruz.

        yetki ayirimi yapacagimiz class'larda
        istedigimiz islemi bizim adimiza yapacak
        public method'lar olusturacagiz

        getter method'lari baska class'lar icin
        private variable'lara ulasir
        ve degerini o class'lara döndürür

    public int getToplamSatis() {

        return toplamSatis;
}

         */

    }
}
