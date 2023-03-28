package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // verilen 3 basamakli bir sayinin rakamları top  yazdıran method oluştur

        C01_MethodCreation.terstenYazdir("nuri");// bunu denemek için diger
                                                        // class dan cagırdık.
        C04_MethodCreation.topla(6,3);
        int input=521;
        rakamlariTopla(input);

    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz "+temp+ " sayisinin rakamlar toplimi:"+rakamlarToplami);

    }


}
