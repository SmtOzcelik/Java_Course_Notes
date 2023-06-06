package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int sayi=40;
    String Isim="Yildiz Koleji";
    /*
    Interface bir class degildir.

    Abstruct class lar java da abstruction (soyutlastirma / kural koyma)
    islevini yapiyordu. Ancak abstruct bir class da abstruct olmayan method lar da
    olabilir. Bu da full abstraction yapmaya izin vermez.

    Eger java da icinde hic concrete method olmasin dedigimiz bir class olusturmak
    istiyorsaniz bunu class degil Interface yapmalisiniz

    1-INTERFACE ler de CONCRETE method OLMAZ.
    2-Interface lar full abstraction yaptigindan Interface lerden obje olusturulmaz

    Hatirladiginiz gibi interface olan List den direk obje olusturamiyorduk
    List<String>liste=new List<>(); calismaz
    Bunun yerine constuructor i List in child i olan Arraylist den seceriz
    List<String>liste=new ArrayList<>();

    3- Class larda bir child birden fazla parent edinemez.
    Ancak Interface de concrete method olmadigindan biz her methodu child class da
    override etmek zorundayiz. Override ederken kimin soyledigini override ettigimizin
    onemi yok.

    4- Interface ler neyin yapilamasi gerektigini soyler ama nasil yapilacagına karısmaz
     */


}
