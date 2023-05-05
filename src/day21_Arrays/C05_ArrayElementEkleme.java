package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayElementEkleme {
    public static void main(String[] args) {

        // Verilen bir array e yeni bir element ekleyen method oluşturun.

        String[] sinifListesi={"Ali Can","Nida Yucedal","Musa Yaman"};
        String eklenecekisim="Murat Babayigit";

        // başa yeni bir isim tanimlamadik sinifListesi gelen giden olsada ayni olur diye
        sinifListesi=elemanEkle(sinifListesi,eklenecekisim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekisim) {
        String[] yeniSinifListesi=new String[sinifListesi.length+1];
        //eski listeden 1 eleman fazla uzunlukta yeni bir array oluşturdum


        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];// yeni listeye eski listeyi aktardim

        }

        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekisim;// aktarim sonrasi yeni geleni ekle


        return yeniSinifListesi;
    }
}
