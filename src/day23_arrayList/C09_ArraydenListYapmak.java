package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu özelliği elemanlari tek tek eklemek
        */

        Integer[]arr={2,3,5,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanli bir listeyi tek tek elaman girmek olarak
        girmek yerine array oluşturup, for loop ile list e taşiyabiliriz
        */

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//[2, 3, 5, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        bu islemin yapmasi için java nin olusturdugu bir method var
        ancak bu yöntemin cok yan etkisi var

         1- bu şekilde oluşturulan listede add, remove gibi size degiştiren
          methodlar KULLANILAMAZ

          2- asList methodu ile oluşturulan liste ve kaynak olan array
          birbiri ile ilişik olarak hayatlarına devam ederler .
          birinde yaptığımız değişiklik otomatik olarak diğerine de işler
          */

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);//[2, 3, 5, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

       /* sayilar2.add(5);
        System.out.println(sayilar2); calişmadi o yuzden yoruma aldik */

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("arrayde degisiklik yapınca sayilar2 :"+sayilar2);
        //arrayde degisiklik yapınca sayilar2 :[20, 3, 5, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        // arr de degişiklik yapınca sayilar2 degişiyor istenmeyen birşey
    }
}
