package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {
        /*
        asagidaki multi dimensional array in ic arraylerindeki tum elemanların
        toplamini birer birer bulan ve her bir sonucu yeni bir array in elemani yapan
        ve yeni array i ekrana yazdiran bir program yaziniz
        */

        int [][] input={{1,2,3},{4,5},{6,7}};
        int [] yeniArr=new int[input.length];
        int toplam=0;

        for (int i = 0; i < input.length ; i++) { // dis loop outer array i gezer
            for (int j = 0; j < input[i].length; j++) { // ic loop ise inner array i gezer

                toplam+=input[i][j];

            }
            yeniArr[i]=toplam;
            toplam=0;

        }
        System.out.println("istenen yeni array : "+ Arrays.toString(yeniArr));
    }
}
