package day08_IfStatemens;

import java.util.Scanner;

public class C01_IfElseIfStatemant {
    public static void main(String[] args) {

        /*
        Kullanıcıdan gün ismi isteyin.girilen gün ismi geçerli ise 1.harf büyük 2.harf küçük
        3.harf küçük yazdırın. gün ismi geçerli değil ise "geçerli gün ismi giriniz" yazdırınız.
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gün ismi girin.");
        String gun=scan.next().toLowerCase();

        if(gun.equals("pazartesi")) {
            System.out.println("Paz");} else if (gun.equals("sali")){
            System.out.println("Sal");} else if (gun.equals("carsamba")){
            System.out.println("Car");}else if (gun.equals("persembe")){
            System.out.println("Per");} else if (gun.equals("cuma")){
            System.out.println("Cum");} else if (gun.equals("cumartesi")){
            System.out.println("Cum");} else if (gun.equals("pazar")){
            System.out.println("Paz");} else {
            System.out.println("Lütfen geçerli bir gün giriniz.");}

    }
}
