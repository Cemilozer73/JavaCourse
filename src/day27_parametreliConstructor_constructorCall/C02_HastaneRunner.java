package day27_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {
    public static void main(String[] args) {

       // Obje deklarasyonu      Yeni obje olusturma ve uygun degerleri atama(initialitation)
        C01_Hastane personel1  =  new C01_Hastane(); // C01_Hastane();Constructor
      //---------------------  O B J E   O L U S T U R M A   -------------------//

    // Hangi class'ın constructor'ı calisiyorsa, o constructor kendi class'İndaki
    // instance variablelerin bir kopyasini olusturur ve objeye yapistirir


        System.out.println(personel1.personelIsmi); // Isim atanmadi
        System.out.println(personel1.getPersonelTelefonu); // Telefon atanmadi
        System.out.println(personel1.hastaneAdi); // Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); // 03122456754

        personel1.getPersonelTelefonu = "5552342323";
        personel1.personelIsmi = "Mertkan";

        C01_Hastane personel2 = new C01_Hastane();
        System.out.println(personel2.personelIsmi); // Isim atanmadi
        System.out.println(personel2.getPersonelTelefonu); // Telefon atanmadi
    }
}
