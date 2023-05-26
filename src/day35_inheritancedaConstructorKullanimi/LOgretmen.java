package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen(){
        System.out.println("LOgretmen paremetresiz cons");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen paremetreli cons");
    }
}
