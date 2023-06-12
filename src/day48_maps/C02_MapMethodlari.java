package day48_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String>sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();// hepsini sildi
        System.out.println("clear dan sonra map : "+sinifListMap);//{}

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        //104 var Deniz, Deniz, Devops getirdi

        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));
        //Aradiginiz key yok yazdirir

        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        //varsa degistirme yoksa ekle demek. 104 var o yuzden bi degisiklik yok
    }
}
