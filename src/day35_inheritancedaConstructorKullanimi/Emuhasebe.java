package day35_inheritancedaConstructorKullanimi;

public class Emuhasebe extends DPersonel {

    Emuhasebe(){
        System.out.println("Muhasebe paremetresiz constructor ");
    }

    Emuhasebe(String isim){
        System.out.println("Muhasebe paremetreli constructor ");
    }
}
