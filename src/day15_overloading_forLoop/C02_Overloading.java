package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

    /*
    java da olusturduğumuz metodların isminin yaptığı islem ile uyumlu olmasını isteriz
    mesala bir string in bir bolumunu almak icin java 2 adet substring() methoduları veya
    verihen String deki bazı parcaları yenileri ile degistirmek icin
    2 adet replace() metodu var.

    Java ayni isimde birden fazla method varsa hangisinin kullanılacagına parametre
    sayısı ve data turune gore karar verir.
    */

        String str = "Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("J","H");

        /*
        ayni isimde ama farklı metodların olusturmak icin degistirebilecegimiz seyler
        1-paremetre sayisi
        2-ayni sayida parametreye sahip olsa bile, parametrelerinin data turleri
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarında
        parametrelerin siralanisi
        */

    }
}