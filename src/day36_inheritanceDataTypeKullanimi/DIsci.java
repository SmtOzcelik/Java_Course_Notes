package day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe{
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturulurken data turu ve constructor ayni class dan ise direk o
        class a gidiyorduk.
        Eger data turu ve constructor farkli ise
        Obje constructor un oldugu class in objesidir ancak bizden isnen
        Isci class ındaki spesifik ozellikleri degil bir iscinin muhasebe clasindaki
        tum calisanlarla beraber sahip oldugu genel ozellikleri yazdirir.
         */
        //obje isci classinda fakat özelliklerini BMuhasebeden alacak
        System.out.println(isc1.gunlukMesai);//8 Muhasebe Clasindan
        System.out.println(isc1.saatUcreti);//10 Muhasebe classindan
        isc1.maas();//personel minumum : 2400 maas alir. Muhasebe classindan
        isc1.ozelSigorta();//isteyen calisanlara %50 indirimli ozel sigorta yapilir

        isc1.sigorta();//Tum personelimiz sigorta yapilir APersonel Classindan
        System.out.println(isc1.isim);//Isim belirtilmedi..APersonel den aldi veriyi
        System.out.println(isc1.soyisim);//Soyisim belirtilmedi..APersonel den aldi veriyi
        System.out.println(isc1.departman);//departman belirtilmedi..APersonel den aldi veriyi
        System.out.println("");
        APersonel isc2=new DIsci();
        //obje isci classinda fakat özelliklerini APersonelden alacak
        //System.out.println(isc2.gunlukMesai); gunlukMesai APersonelde yok CTE
        //System.out.println(isc2.saatUcreti); saatUcreti APersonelde yok CTE

        //isc2.ozelSigorta(); APersonel  de yok CTE

        isc2.sigorta();//Tum personelimiz sigorta yapilir APersonel Classindan
        System.out.println(isc2.isim);//Isim belirtilmedi..APersonel den aldi veriyi
        System.out.println(isc2.soyisim);//Soyisim belirtilmedi..APersonel den aldi veriyi
        System.out.println(isc2.departman);//departman belirtilmedi..APersonel den aldi veriyi
    /*
    Eger data turu olan class da aradigimiz ozellik yoksa,varsa onun parent ine gidebilir.
    Ama child a donus olamaz. Aradigi ozelligi bulamazs CTE verir
     */

    }


}
