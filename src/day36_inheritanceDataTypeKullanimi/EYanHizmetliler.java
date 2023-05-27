package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){

        System.out.println("Yan hizmetililer : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }
    protected void issezlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli issizlik sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class daki bir methodun parent class daki ayni isimdeki methodu
        etkisiz hale getirerek kendisinin spesifik ozelliginin ortaya cıkarmasıdır

        Overriding i nerede dikkate aliyoruz?
        bir obje olusturulurken data turu ve constructor farkli ise

        Eger bir obje olusturulurken data turu ve constructor farkli ise objenin ozelliklerini
        belirlerken 3 konuya dikkat cekmeliyiz.
        1- obje constructor un oldugu class da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class dan baslariz. Bu classda
           aranan ozellik bulunamazsa parent classlara bakilir.Orada da bulunmazsa CTE olur
           eger aranan ozellik varible ise buldugumuz ilk degeri yazdiririz
        3- aranan ozellik method ise degeri yazdirmadan once override edilmis mi diye
           kontrol etmemiz gerekir
           eger override edilmisse en guncel degeri yazdiririz
         */

        BMuhasebe yh1=new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);//8 Muhasebe Clasindan
        System.out.println(yh1.saatUcreti);//10 Muhasebe classindan
        yh1.maas();//Yan hizmetililer : 2160 maas alir. Method oldugu icin spesifik mi yani
        // kendi class inda maas methodu varmi(overriding) var onu alir. variable da yok
        yh1.ozelSigorta();//isteyen calisanlara %50 indirimli ozel sigorta yapilir
        //method overriding varmi baktik yok o zaman Muhasebeden celistir
        yh1.sigorta();//Tum personelimiz sigorta yapilir APersonel Classindan
        //Bmuhasebe de yok parent bak bulduk ama hemen calistirmaz overriding var mi
        // bakalim sigorta() methodu Yanhizmetlilerde yok overriding yok
        System.out.println(yh1.isim);//Isim belirtilmedi..APersonel den aldi veriyi
        System.out.println(yh1.soyisim);//Soyisim belirtilmedi..APersonel den aldi veriyi
        System.out.println(yh1.departman);//departman belirtilmedi..APersonel den aldi veriyi
        //sout(yh1.issizlikSigortasi) aramaya muhasebeden basladik yok parent e bak
        // ordada yok CTE olur.ama parentde olsa idi classina bakicaktik overriding mi diye
    }

}
