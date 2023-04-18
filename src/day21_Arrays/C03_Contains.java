package day21_Arrays;

import java.util.Scanner;


public class C03_Contains {
    public static void main(String[] args) {

        // kullanicidan aldiğiniz bir ismin verilen bir array de olup olmadiğini kontrol edip
        // bize true veya false sonucu DÖNEN bir method oluşturun

        String[] isimler = {"basah", "nurullah", "fatih", "adem", "enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("aradiğiniz ismi yaziniz");
        String arananisim = scan.nextLine();

        boolean sonuc = contains(isimler, arananisim);

        if (sonuc) {
            System.out.println("girilen isim listede var");
        } else {
            System.out.println("girilen isim listede yok");
        }
    }
    public static boolean contains(String[] isimler,String arananisim){

        boolean sonucMethod = false; // atama yapalim ki karsılastirmaya baslayalim

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananisim)){
                sonucMethod=true;
            }

        }


        return sonucMethod;
    }
}