package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        /*
        Java Entry<K,V> map icinde bulunan her bir kaydi K=V seklinde tutar
        Dolayısıyla herhangi bir Entry e ulastigimizda hem key e hem de value ya
        ulasabilir ve istedigimiz islemleri yapabiliriz

        entry.getKey() bize key i getirir
        entry.getValue() bize value yu getirir
        entry.setValue() value yu istedigimiz deger olarak update eder
         */

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //her bir elemani alt alta yazdirin
        //entrySet methodu Set donderdigi icin Set tanimladik attik
        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            System.out.println(each);
        }

    // Map in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim
        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}
