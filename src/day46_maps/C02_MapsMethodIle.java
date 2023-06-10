package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();

        //tum verileri teker teker girmek yerine yan class da
        // olusturdugumuz map i cagirdik  atama yaptik ki kullanabilelim

        System.out.println(ogrenciMap);

        // value lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // isim ve soyisimlerin birlikte olacagi bir liste olusturun

        List<String>sinifisimsoyisimList=ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);

        System.out.println("isim soyisim listesi : "+sinifisimsoyisimList);



    }

}
