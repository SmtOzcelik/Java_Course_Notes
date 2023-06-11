package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

        Map<Integer,String>sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //ogrenci listesini isim soyisim olarak yazdir

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //kac farkli brans varsa bransIsmi=branstakiOgrencisayisi seklinde yazdirin
        //yazdirin dedigi icin List yapmayacagiz

        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);


    }
}
