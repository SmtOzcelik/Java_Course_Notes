package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {

        // 2 string array oluşturunuz ve bu array lerdeki ortak elemanlari
        // For-each kullanarak bulunuz.Sonucu ekrana yazdiriniz.
        //ortak eleman yoksa ekrana "ortak elaman yok" yazdiriniz.

        String[]arr1={"ali","veli","can","ayse"};
        String[]arr2={"ali","hasan","ayse","enes"};

        List<String> ortakisimler=new ArrayList<>();

        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakisimler.add(each1);
                }

            }
        }
        if (ortakisimler.isEmpty()){
            System.out.println("hic ortak eleman yok");
        }else {
            System.out.println("her iki arraydeki ortak isimleri : "+ortakisimler);
        }
    }


}
