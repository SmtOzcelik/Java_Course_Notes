package day35_inheritancedaConstructorKullanimi;

public class BParent extends AGrandParent{

    protected String isim="Parent isim belirtilmedi";
    protected String parentKulupAdi="Parent Klubu";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
