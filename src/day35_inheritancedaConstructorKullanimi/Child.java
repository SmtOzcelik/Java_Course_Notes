package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";

    protected String childKulupAdi="Child Klubu";

    Child(){
        System.out.println("Child constroctur calisti");
    }

    public static void main(String[] args) {
       AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Grandpa constoructor calisir.
        //parent veya child constructor celismaz

        Child child1=new Child();
        child1.granpaKulupAdi="Child1";
        child1.parentKulupAdi="Child2";

        //child1 objesi icin Child constructor calisti
    /*
    Java da bir class i kullanabilmek icin o classdan obje olusturur.
    dolayiyla o class in constructor unu kullanirdik

    java inheritance da parent class lardaki ozellikleri kullanabilmek icin
    o class larin constructor larini otomatik calistiran bir yapi kurmustur.

    ornegin biz child class nida Chlid class indan bir obje olusturmak istedigimizde
    Child constructoru ini kullaniriz

    Java Child(){} gordugunde once parent in constructor ini calistirmam lazim der
    buradan Parent constructor a gider
    Parent class inda Parent(){} gorunce once bunun parent inin yani Granparent
    constructor in calismasi gerekir der
    Böylece extends keyword olmayana class a kadar gider ve oradan baslayarak tum
    constructorlari asagi dogru calistirir.
     */
    }
}
