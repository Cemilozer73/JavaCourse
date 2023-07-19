package day13_stringManipulations_forLoop;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";

        str= str.replace("1","");

        System.out.println(str); // Ja4va 8C9a2n5dir.

        // Sayilarin tamamindan kurtulmak istersek
        // replace() yeterli olmaz

        // java da sayilar, ozel karakterler, alfabetik karalkterlerin
        // tumuyle islem yapmak isterseniz
        // replaceAll(istenenGrup, yeniDeger)

        // ornegin butun sayilarin yerine "" atamak icin (regular expression = regex)

        str= str.replaceAll("\\d","");
        System.out.println(str); // Java Candir.

        /*
        Regex (Regular Expressions)
            \\s : space (bosluklari silmek icin)  \\S : space olmayan herseyi silmek icin
            \\s+ : yanyana birden fazla space si silmek icin
            \\d : digits sayılari silmek icin     \\D : digit olmayan herseyi silmek icin
            \\w : harf veya rakami silmek icin   \\W : harf veya rakam olmayan herseyi silmek icin

         */
    }
}
