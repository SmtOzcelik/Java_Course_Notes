package day35_inheritancedaConstructorKullanimi;

import day33_encapsulation.Ogretmen;

public class Matematikciler extends LOgretmen {

    Matematikciler(){
        System.out.println("Matematik paremetresiz cons");
    }

    Matematikciler(String isim){
        this();
        System.out.println("Matematik paremetreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this() constructor call, icinde bunulan class daki constructor lari,
    super() ise parent class da bulunan constructor lari cagirir.

    this() veya super() paremetre yapisina uygun bir constructor bulamazsa
    Java CTE verir.

    constructor konusunda gordugumuz this. o class da ki intance variable lari
    refere ediyordu.

    inheritance da da super. vardir
    super. parent class daki instance lari refere eder
     */
}
