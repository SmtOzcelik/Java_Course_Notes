package day29_passByValue_immutable;

public class C05_immutable {
    public static void main(String[] args) {

        String isim="Mine";

        isim=isim.toUpperCase();//atama yapildigi icin isim kalici degisir

        System.out.println(isim);//MINE
        isim="Mevlüt";
        System.out.println(isim);//Mevlüt

        for (int i = 0; i <10 ; i++) {

            isim += ".";

        }
        System.out.println(isim);//Mevlüt..........

    }
}
