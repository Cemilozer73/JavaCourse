package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time); // 21:39:46.774698

        System.out.println(time.getHour()); // 21 saatı getirir

        System.out.println(time.getMinute()); // 39 dakikayı getirir

        System.out.println(time.minusMinutes(1000)); // 05:01:14.483671 // 1000 dk önce

        System.out.println(time.minusHours(100)); // 17:42:21.635573 // 100 saat önce

        System.out.println(time.plusSeconds(10000)); // 00:29:38.510897 // 10000 saniye sonra

        System.out.println(time.withHour(15)); // 15:43:59.917627 // sadece saati 15 yap

        System.out.println(time.withSecond(0).withNano(0)); // 21:45 // saniye nanoyu sıfırlıyor

        LocalTime time1 = LocalTime.of(12,35); // saat 12 olsun dakika da 35
        LocalTime time2 = LocalTime.of(14,34); // saat 14 olsun dakika da 34

        System.out.println(time1.isBefore(time2)); // true // time1 time2 den once mi
        System.out.println(time1.isAfter(time2)); // false //time1 time2 den sonra mi

    }
}
