package day42_abstractClass_Interface;

public interface I03_Interfaces  {

    int sayi=20;

    /*
    int sayi;
    interface lerde tum variable la public static ve final dir.Dolayisiyla
    sonradan deger atama sansimiz yoktur.Variable olustugunda deger atanmalidir.

    Bir interface bir class i parent edinemez.
     */

    void yakit();

    /*
    Interface icerisindeki her method public ve absract ozellikleri sahiptir

    Abstract bir methodun bady si olmasi mumkun degildir.Java sonradan developer
    istegi uzerine kismi bir update yapmistir.

    Bir interface sonradan bir abstract method eklerseniz o interface i daha once
    implement etmis tum class lara gidip hepsini yeni eklenen methodu override etmeniz gerekir.
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir.

    Bunun icin java java8 den itibaren interface lere sonradan bady si olan method eklenmesine
    izin vermistir.

    Bu methodlarin bady si olsa da interface in yapisi geregi bu methodlara concrete denmez.
    Bu bady si olan bu methodlar istisna olarak kabul edilebilir.
     */

    public void motor();

    public abstract void teker();


}
