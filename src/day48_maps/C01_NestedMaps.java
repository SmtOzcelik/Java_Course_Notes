package day48_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

          /*
        Eger bir elementle ilgili tutacagimiz bilgiler coksa bu defa ic ice map
        kullanmayi tercih edebiliriz.

        Ic ice map kullandigimizda daha fazla datayi daha duzenli olarak tutma imkanimiz olur
        Ancak bilgiye ulasmak ve manipule etmek zorlasacaktir.

        Ornek olarak dunku map imizi map lerden olusan bir map olarak olusturalim.
        sinifMap.put(no=102, isim=Enes, soyisim=Cem, brans=Tester");
        sinifMap.put(103,"Taha, Emre, Java");
        sinifMap.put(104,"Derya, Deniz, Devops");
         */

        Map<String,String>ogr101=new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map<String,String>ogr102=new HashMap<>();
        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("brans","JDev");

        Map<String,String>ogr103=new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Devaps");

        Map<Integer,Map<String,String>>ogrencinestedMap=new HashMap<>();
        ogrencinestedMap.put(101,ogr101);
        ogrencinestedMap.put(102,ogr102);
        ogrencinestedMap.put(103,ogr103);
        // mapleri alt alta yazdiralim entrySet ile

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti=ogrencinestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti
             ) {
            System.out.println(each);
        }

        //102 nolu kisinin ismini yazdiralim

        System.out.println(ogrencinestedMap.get(102).get("isim"));//Taha

    }
}
