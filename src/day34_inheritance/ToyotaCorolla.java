package day34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class dan parent class a erisimde access modifer kurallarini
        bypass edemeyiz ornegin parent class daki privite class uyelerini child class dan
        kullanamayiz. ayni sekilde parent ve child farkli package larda ise
        parent class daki default access modifier olan class uyelerini child class dan kullanamayiz

         */

        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka);//Toyata
        System.out.println(arb1.model);//Model belirtilmedi

    }
}
