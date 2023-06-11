package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdigimiz key in map de olup olmadigini boolen olarak doner
        map.contains(value)==> bir butun olarak value nun map de olup olmadigini doner

        ONEMLI NOT: map.contains(value) value nin icindeki bir parcayi bulmada ise yaramaz
         Eger value icindeki bir parcayi aratmak istiyorsak map uzerindeki manipulation yapmaliyiz

         map.get(key)==> verilen key e ait degeri dondurur
         */

        Map<Integer,String>sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.containsKey(104));//true siniflistmap da 104 var
        System.out.println(sinifListMap.containsKey(114));//false siniflistmap da 114 yok

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifListMap.containsValue("JDev"));// false kismi bakamaz

        // SORU : verilen map de JDev degerlerini JavaDeveloper olarak degistirelim

        // Map lerde replace tum value yu degistirmek istersek kullanabiliriz
        //kismi degisikliklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map i guncelleme yapmak icin (key,yeni degeri) map e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin siniflistMap.put(101,Ali, Can, JavaDeveloper)

        // bunu yapabilmek icin herbir key e ve ona ait value ya ihtiyacim var

        Set<Integer> keySeti=sinifListMap.keySet();// key de set de uniqu oldugundan tanimladik
        String eachValue;
        for (Integer each:keySeti
             ) {
            eachValue=sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            biz key lerin tamamini aldik herbir key in value sunu getirdik
            value uzerinde degisiklik yapip yeni deger ile map e koyduk
             */
        }

        System.out.println(sinifListMap);





    }
}
