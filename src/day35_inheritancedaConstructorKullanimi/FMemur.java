package day35_inheritancedaConstructorKullanimi;

public class FMemur extends Emuhasebe{
    /*
    Extends keyword kullanilan class larda ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim. java constructor in ilk
    satirina super(); constructor call yazar.

    super(); constructor call,default constructor a benzer gorunmesede orada vardir
    calisir,ancak biz ilk satira farkli constructor call yazarsak Java super(); i siler

     Eger biz mudahale edip kendi constructor umuzu olusturmazsak javanin default olarak
     olusturdugu constructor call her zaman parametresizdir.
     */
    FMemur(){
        System.out.println("Memur parametresiz constructor");

    }

    FMemur(String isim){
        System.out.println("Memur parametreli constructor");

    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("Ali"); //parametreli constructor u calistirir

    }
}
