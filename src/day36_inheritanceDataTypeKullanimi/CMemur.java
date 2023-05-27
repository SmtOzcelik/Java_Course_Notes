package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

   protected int saatUcreti=12;
    protected int gunlukMesai=9;

   protected void maas(){
       System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
   }
   protected void ozelSigorta(){
       System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
   }

    public static void main(String[] args) {

       CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9 bu class da var
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//Memurlar : 3240 maas alir.//bu classda ki maas methodu calisti
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        // bu class da ki ozelSigorta methodu calisti
        mmr1.sigorta();//Tum personelimiz sigorta yapilir. APersonel den aldi veriyi
        System.out.println(mmr1.isim);//Isim belirtilmedi..APersonel den aldi veriyi
        System.out.println(mmr1.soyisim);//Soyisim belirtilmedi..APersonel den aldi veriyi
        System.out.println(mmr1.departman);//departman belirtilmedi..APersonel den aldi veriyi

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar memur class inin icinde olsamda olusturdugum obje Muhasebe class indan
        cunku data turu ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer>list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class i da obje olusturulabilen bir class dir yani data turudur.

         */
        System.out.println(mhsb1.gunlukMesai);//8 BMuhasebeden aldi
        System.out.println(mhsb1.saatUcreti);//10 BMuhasebeden aldi
        mhsb1.maas();//personel minumum : 2400 maas alir. BMuhasebden aldi
        mhsb1.ozelSigorta();//isteyen calisanlara %50 indirimli ozel sigorta yapilir
        // BMuhasebe class inda ki ozelSigorta methodu calisti
        mhsb1.sigorta();//Tum personelimiz sigorta yapilir. APersonel den aldi veriyi
        System.out.println(mhsb1.isim);//Isim belirtilmedi..APersonel den aldi veriyi
        System.out.println(mhsb1.soyisim);//Soyisim belirtilmedi..APersonel den aldi veriyi
        System.out.println(mhsb1.departman);//depertman belirtilmedi..Apersonel den aldi veriyi

    }
}
