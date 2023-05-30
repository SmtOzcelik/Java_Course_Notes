package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Markettedeki tum urunleri bir arrayde tuttugumuzu varsayalim.
        Kullaniciya index sorup o index deki urunu yazdiran bir program yapalim.
        Kullanici urun sayisindan buyuk index girerse exception vermesinin onune gecelim
         */

        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan;
        int istenenSira=0;
        boolean olduMi=true;

        while (olduMi){



        try {
           scan =new Scanner(System.in);
            System.out.println("Isteginiz urunun sira no giriniz");
            istenenSira=scan.nextInt();
            olduMi=false;

        } catch (InputMismatchException deneme) { // e yerine deneme yazdik
         //buraya ne istersek o gelir hatayi getir veya ben sout yaparim
            System.out.println("urun indexi icin bir tam sayi giriniz");
        }


        /*
        catch blogunun onundeki parantezde exception class inin ismi ve yaninda
        yakalanan exception i atadigimiz variable in ismi olur (e)

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz. eger exception ile ilgili kullaniciya bilgi verme
        ihtiyacı yoksa e kullanilmasa da kod calisir
         */


        }
        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiginiz sira listemizde bulunmuyor");
            System.out.println("Sira numarasi en fazla : "+urunler.length+ " olabilir");
        }
    }
}
