package day34_inheritance;

public class A_Isci extends A_Personel {
    /*
    Normal hayatimizda parent cocuk sahip olmaya karar verebilir.
    Java da ise child class lar ozelliklerini inherit etmek istedikleri class i
    kendilerine parent edinirler.

    Mesela isci class ini olusturunca nelere ihtiyaci var diye düsünsek
    personel class inda ki tum variable ve methodlara ihtiyacı oldugunu görebiliriz
    Bu durum yeniden o variable ve method lari olusturmak yerine Personel class ini
    kendimize parent ediniriz.

    Bir class i parent edinmek icin extends keyword kullanmaliyiz.

    Bir class baska bir class i parent edindiginde
    1- parent class da ki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2- perent class daki ozellikleri kendine uyarlayabilir
    3- parent class da olmayan bazi yeni ozellikler olusturabilir.
    not: parent class daki ozelliklerin hicbirini reddedemez ama degistirebilir
     */
    int persNo=1001;

    public static void main(String[] args) {
        A_Isci isci1=new A_Isci();
        System.out.println(isci1.isim);//"Isim belirtilmedi"
        // kendi class imizda isim variable yok,onun icin parent e gidiyoruz
        isci1.isim="Selim";
        System.out.println(isci1.persNo);//1001 kendi class imizda varsa onu kullanir

        isci1.maas();//Isciler minumum 15 euro saat ucreti alir
        // eger asagida maas methodu olmasa idi parent i olan Personel class indan veri alacakti
    }

    public void maas(){
        System.out.println("Isciler minumum 15 euro saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yapilir");
    }
}
