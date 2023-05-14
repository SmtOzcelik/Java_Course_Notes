package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Birden fazla element iceren array ve arraylist gibi yapilarda da
        passByValue gecerlidir.

        Eger method da array veya list in kendisi degistirilirse passByValue
        ozelligi sebebiyle java degisen degeri degil array veya list in
        orijinal degerini alir.

        Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        java obje degismedigi icin(referans ayni) ayni array veya list i bize
        dondurur ancak icindeki elementler degismis olacaktir.
         */
        /*
        verilen 4 elemanli bir array i method a gönderelim. method da yeni 3 elemanli
        bir array atayip bu yeni array e rastgele 100 den kucuk 3 sayi atayalim.
        method da array i yazdiralim. main method da metod call dan sonra yeniden
        methodu yazdiralim.
         */

        int[]arr={3,5,8,10};

        arrayiDegistir(arr);

        System.out.println("method call dan sonra main method da array : "+Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {

        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("method da array : "+ Arrays.toString(arr));
    }
}
