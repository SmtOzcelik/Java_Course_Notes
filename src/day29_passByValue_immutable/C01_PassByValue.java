package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
    4 elemanli bir array olusturalim sonra bir ayri metod da bu array in
    2. ve 4. elemanlarini 100 den kucuk rastgele bir sayi ile degistirelim
    ve yeni halini yazdiralim.
     */

        int[]arr={5,7,8,10};

        elemandegistir(arr);

        System.out.println("main methodun icinde diger method calistikdan sonra:"+Arrays.toString(arr));
        //[5,7,8,10] beklenen fakat [5, 56, 8, 40]
        // arrayin elemanliri degisebilir kendisi degismez
        //referansda 4 elemanli array olarak gitti geri 4 elemanli array geldi
        // kalip ayni ama icindeki sayilar degisebilir.
    }

    public static void elemandegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("method un icinde : "+ Arrays.toString(arr));//[5, 56, 8, 40]

    }


}
