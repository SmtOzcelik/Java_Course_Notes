package day43_interface_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    Normal bir class da oldugumuzu dusunursek iki tane access modifier kullanma
    ihtimali OLAMAZ.

    Asagidaki method da goreceginiz gibi interface de istisnai olarak body si
    olan method lar olusturulabilir. Bu ozellik java8 den sonra kullanilmaya baslamistir.
    interface e yeni bir method eklememiz gerektiginde eskiden beri bu interface i
    implement eden tum class lara gidip yeni eklenen methodu override etmemiz gerekirdi.

    Bu ozellik sayesinde basina default veya static keyword ekleyerek interface e yeni
    ve body si olan bir method olusturursak bu methodun child classlar tarafından
    override edilme MECBURİYETİ OLMAZ. ve eskiden implement etmis class lari
    degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturalan genel kurallari bozmaz.

    Bu method larin body si olsa da bunlara concrete method denmez ama
    override edilme mecburiyetileri yoktur.

    Buradaki default kelimesi access modifier degil istisnai durum belirtilmesi icindir.

    O zaman nicin 2 keyword (static ve defeult) tanimlanmistir
    Bu iki farkli kelimenin amacı child class lardan bu methoda nasil erisebilecegini
    belirlemek için dir. Static keyword kullanilirsa child class lardan bu methoda
    erismek icin interfaceAdi.methodAdi yeterli olur.

    default keyword kullanilirsa methoda erismek icin obje olusturulmalidir.


     */

    public default void teker(){
        System.out.println("default ...tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("static ...tum arabalarin direksiyonu vardir");
    }
}
