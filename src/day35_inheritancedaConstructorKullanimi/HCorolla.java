package day35_inheritancedaConstructorKullanimi;

public class HCorolla extends GToyata{
    HCorolla(){


        System.out.println("HCorolla paremetresiz constructor");
    }
    HCorolla(String isim){
        super(isim);
        System.out.println("HCorolla paremetreli constructor");
    }
}
