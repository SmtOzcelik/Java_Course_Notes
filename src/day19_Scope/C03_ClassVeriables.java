package day19_Scope;

public class C03_ClassVeriables {
    public static void main(String[] args) {
        /*
        farkli bir class da calisirken herhangi bir class adını yazip noktaya basarsak
        adını yazdıgimiz class daki tüm STATİC class uyelerini görebilir ve kullanabiliriz.
         */
        C02_StaticVariables.staticMethod();//10  bunu calistirirken istenilen clas a gider
        // sadece istenen methada girir diger methodlarla hic bagi yokmus gibi bütün verileri
        // ilk basta ne ise ona göre işlemini yapar alır gelir.

        System.out.println(C02_StaticVariables.staticSayi);//10 class calistirma yok direk class
        // başina var bilgi al getir. işlem falan yaptirma yok

        System.out.println(C02_StaticVariables.degersizstaticVar);//0 class çaliştirma yok direk class
        // başina var bilgi al getir. baktiğimizda değer atanmamış ise aşagıdaki default u uygular

        /*
        Class level variable lara deger atayip atamamak bize kalmiştir. istersek deger
        ataması yapabiliriz, istemezsek deger atamayiz.eger deger atamıssak java atadiğimiz
        o degeri kabul eder. deger atamazsak java bu variable lere default bir deger atamasi yapar
        int--> 0
        String --> null
        boolean --> false
        char -->'' (hiclik)
         */

        /*
        baska class daki instance variablelere obje oluşturarak ulaşabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();// 10
        // bu method içinde staticsayi=20 oldu
        System.out.println(obje1.isim);// Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0

        System.out.println(C02_StaticVariables.staticSayi);//20
        /* farkli bir class dan C02 clasindan method ve variablelari kullandiğimda C02 class in
        tamami degil sadece benim cagirdiğim class uyeleri calişir
         */
    }
}
