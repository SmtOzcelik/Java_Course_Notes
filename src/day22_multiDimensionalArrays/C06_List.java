package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array i array yapan sembol [] idi.
        arrayList de ise < > diamond(elmas) kullaniriz
        */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);// [] direk kod olmadan yazdirabilir.normal array deki gibi değil

        // bir List e eleman eklemek istersek
        isimler.add("Basak");// yazdıracak olsak true cıkar ekmedim diye

        System.out.println(isimler.add("ayşe")); // true döner, basak ve ayşe eklendi.


        /*
        String de bir metod caliştirdiğimizda assign yapmazsak String degişmiyordu
        String isim="suleyman"
        isim.toUpperCase;// SULEYMAN yazdirirsak fakat atama yapmadiği icin
        isim yine suleyman
        */

        System.out.println(isimler);//[Basak, ayşe]

        /* List in tek kotu tarafı array alt yapisini kullandiği icin
        elemanlari birer birer eklemek zorunda olmamızdir.    */

    }
}
