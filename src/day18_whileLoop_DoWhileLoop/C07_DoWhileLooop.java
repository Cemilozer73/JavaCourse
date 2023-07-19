package day18_whileLoop_DoWhileLoop;

public class C07_DoWhileLooop {
    public static void main(String[] args) {
        /*
            3 cesit loop gorduk
            hepsinin avantajlari ve dezavantajlari var
            1- for loop baslangic ve sonucu belirli sayi olan durumlarda
               veya kac kere tekrar edecegimizi bildigimiz durumlarda avantajli
            2- while loop; kac kere tekrar edecegini bilmedigimiz
               islemleri yapmak icin avantajli
            3- do-while loop kullanicidan deger alarak yaptigimiz islemlerde
               ilk deger atamasini kod yazan kisinin degil de
               kullanicinin yapmasi acisindan avantajli
         */

        /*
        Java'da for loop, while loop ve do-while loop, döngü yapısını gerçekleştirmek için kullanılan
        üç farklı yapıdır. İşlevlerine ve kullanım amaçlarına bağlı olarak, bu döngü yapıları arasında
        bazı farklılıklar vardır. İşte bu üç döngü yapısının en önemli farkları:

                For Loop: For loop, belirli bir şart sağlandığı sürece tekrarlanan bir döngü yapısıdır.
        Genellikle bir sayacın değerini artırarak veya azaltarak tekrarlı işlemleri gerçekleştirmek için kullanılır.
        For loop'un üç temel unsuru vardır: başlangıç ifadesi, kontrol ifadesi ve artırma/azaltma ifadesi.
        For loop, tekrar sayısını önceden bilinen durumlarda veya belirli bir aralıkta döngü yapısının uygulanması
        gerektiği durumlarda tercih edilir.

        Örnek kullanım:

        java
        Copy code
        for (int i = 0; i < 5; i++) {
            // İşlemler
                        }

                While Loop: While loop, belirli bir şart sağlandığı sürece tekrarlanan bir döngü yapısıdır.
        While loop, döngü başlamadan önce şartın sağlanıp sağlanmadığını kontrol eder.
        Eğer şart sağlanıyorsa, döngü işlemlerini gerçekleştirir. While loop, döngüye başlamadan önce
        tekrar sayısını tam olarak bilemediğimiz durumlarda tercih edilir.

        Örnek kullanım:

        java
        Copy code
        int i = 0;
        while (i < 5) {
            // İşlemler
            i++;
        }
            Do-While Loop: Do-while loop, while loop'a benzer, ancak döngü içindeki işlemler
        en az bir kez gerçekleştirilir. Şart döngü sonunda kontrol edilir.
        Eğer şart sağlanıyorsa, döngü tekrarlanır. Do-while loop, en az bir kez işlemleri
        yapmanız gereken durumlarda tercih edilir.

        Örnek kullanım:

        java
        Copy code
        int i = 0;
        do {
            // İşlemler
            i++;
        } while (i < 5);

            Hangi döngü yapısının kullanılacağı, işlevselliğe ve gereksinimlere bağlıdır.
        Eğer tekrar sayısını önceden biliyorsanız ve belirli bir aralıkta döngü yapısı
        uygulamanız gerekiyorsa for loop kullanmak daha uygundur. Eğer tekrar sayısını
        tam olarak bilemiyorsanız ve şart döngüye başlamadan önce kontrol edilecekse while loop
        kullanmak daha uygundur. Eğer en az bir kez işlemleri gerçekleştirmeniz gerekiyorsa do-while loop
        kullanmak daha uygundur. Ancak hangi döngü yapısının kullanılacağı tamamen
        tercihinize ve ihtiyacınıza bağlıdır.
                 */


        int bas = 30;
        int bit = 20;
        int toplam = 0;
        // while loop ile baslagic degeri ile bitis degeri arasindaki
        // sayilari toplayip yazdirin (sinirlar dahil)
        // baslangic degeri bitis'ten buyukse, toplama olmamali
        while (bas <= bit){
            toplam += bas ;
            bas++;
        }
        System.out.println("while loop ile aradaki sayilarin toplami : " + toplam);
        // simdi de do while loop ile yapalim
        bas = 30;
        bit = 20;
        toplam = 0;
        do {
            toplam += bas ;
            bas++;
        }while (bas <= bit);
        System.out.println("do while loop ile aradaki sayilarin toplami : " + toplam);
    }
}
