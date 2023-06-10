package day46_maps;

import java.util.*;

public class ReusableMethods {
    public static Map<Integer,String> mapOlustur(){

        Map<Integer,String>sinifMap=new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, Java");
        sinifMap.put(104,"Derya, Deniz, Devops");
        sinifMap.put(105,"Enes, Can, Tester");
        sinifMap.put(106,"Taha, Deniz, JDev");
        sinifMap.put(107,"Derya, Cem, Tester");

        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {

        int sira=1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira +" - "+each);
            sira++;


        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

        List<String>methoddakiList=new ArrayList<>();

        String[]eachArr;
        for (String each:ogrenciMap.values()
             ) {
            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0]+" "+eachArr[1]);
        }

        return methoddakiList;
    }

    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //brans=bransdakiOgrenciSayisi                      //HashMap de yapabilirdik
        Map<String,Integer>bransOgrSayiMap=new TreeMap<>();//TreeMap yaptik cunku harf sirasina göre cıksin

        //volue de ki brans i almak icin volue leri Collection a atalim
        Collection<String>valueCollection=sinifListMap.values();
        // bu value lerin icin de isim soyisim brans birlikte oldugu icin arr split ile parcala
        String valueArr[];
        String brans;
        Integer bransdakiOgrenciSayisi;
        for (String each:valueCollection
             ) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            //bransin bransOgrSayiMap inde key olarak daha onceden eklenip eklenmedigini kontrol edelim
            if (!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else {
                bransdakiOgrenciSayisi=bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans,bransdakiOgrenciSayisi+1);
            }

        }
        System.out.println(bransOgrSayiMap);
    }


    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer,String>>sinifListEntrySeti=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> entry:sinifListEntrySeti
        ){
            System.out.println(entry);
        }
    }
}
