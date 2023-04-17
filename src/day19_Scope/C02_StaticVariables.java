package day19_Scope;

public class C02_StaticVariables {

    static int staticSayi = 10; // sayiyi static olduğu başina yazılarak belli edilir.
    String isim = "mehmet";

    static int degersizstaticVar;
    int degersizInstanceVariable;

    //class leveldeki veriable lara deger atamasak da java kabul ediyor


    public static void main(String[] args) {

        //bir variable static olusturulduysa objeler icin degil class icin gecerlidir.

        System.out.println(staticSayi); // 10
        staticMethod();//10 gelecek cünkü method icinde static sayi yazdır komutu var
        staticSayi=12;
        System.out.println(staticSayi);//12

        C02_StaticVariables obje1=new C02_StaticVariables();// staticolmayan methodu cagirmak için
        obje1.staticOlmayanMethod();//12 cünkü yukarida deger atadimisti ve yazdirdi
        // devaminda ise staticOlmayanMthod ici staticsayi yi 20 i atadi
        // obje1 kullandik geldi.ayni instance
         System.out.println(staticSayi);// 20                    sayi çagirdigimiz gibi


        /*
        instance bir variablenin degerini bulmak icin objenin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        static variable da ise class in en basinan baslayarak istenen satira kadar kodu takip
        edip static variable nin son degerini bulmamiz gerekir.
        */

}
    public static void staticMethod(){
        System.out.println(staticSayi);//10

    }
    public void staticOlmayanMethod(){

        /*
        Static variable lar class içerisinden heryerden ulasilabilir
        static olsun veya olmasin tum method lar static variablelari görebilir degiştirirler
        farkli methodlarda static variable in hangi degeri alacagini bilmek istiyorsak
        class in basindan itibaren kodun calismaini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method da kullanabiliriz
        */

        System.out.println(staticSayi);//12
        staticSayi=20;

    }
}
