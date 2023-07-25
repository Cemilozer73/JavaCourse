package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {20,30,5,45};

        // arrayin tum elementlerini toplayin
        // arrayin tum elementlerini yazdirin
        // arrayin elementlerinden cift sayi olanlari yazdirin
        // arrayin elementlerinden en buyuk olani bulun.

        /*
            array'in tum elementlerini gozden gecirmemiz gereken sorularda
            for loop kullaniriz

            for loop'un en onemli ozelligi index sayesinde
            tum elementleri 0.index'den sonuncu index'e kadar sirali olarak getirmesidir

            ama bu sorularda elementi sirasiyla getirmesinin hic bir onemi yok

            indexin yani sirali getirmenin onemli olmadigi durumlarda
            for loop yerine for-each loop kullaniriz
         */


        // array'in tum elementlerini yazdirin

        for (int each: arr
        ) {
            System.out.print(each + " ");
        }
    }
}
