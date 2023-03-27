package day13_methodCreation;

public class C03_StringManipulations {
    public static void main(String[] args) {
        /*
        "  Java ogrenmek123 Cok guzel@  " stringini
           "Java ogrenmek cok guzel." şekline getirin.
           */

        String str="  Java ogrenmek123 Cok guzel@  ";
        // sondaki ve bastaki boşluklardan kurtulmak için trim() metodu kullanalım
        str=str.trim();

        // sayılardan kurtulalım replace de d kullan yerine "" koy
        str=str.replaceAll("\\d","");

        // @ isaretinden kurturalım
        str=str.replace("@","");

        // C yi c yapalım
        str=str.replace("C","c");

        // sonuna nokta koyalım.
        str=str+".";

        System.out.println(str);

    }
}
