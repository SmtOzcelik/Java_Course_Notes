package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private metodlar override edilemez.
        Eger child class da parent class daki private method ile ayni signature da
        bir method olusturursaniz bu overriding method OLMAZ
         */
    }

    void motor(){
         /*
       Override notasyonu javaya bir görev verir
       java,bu notasyonla birbirine bagli olan iki methodu surekli kontrol eder
       eger parent class daki override methodu silerseniz CTE verir

       Override notasyonu kullanmak mecburi degildir.
       Eger overriding method silinirse kodun CTE vermisini istersek
       override notasyonu kullanmaliyiz
        */

    }



}
