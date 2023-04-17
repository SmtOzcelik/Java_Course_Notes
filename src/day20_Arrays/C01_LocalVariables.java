package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

    int sayi=10;

    //System.out.println(sayiMethod); SayiMethod method1 de oluşturulmuş local variabledir.

        for (int i = 10; i <20 ; i++) {
            System.out.println(i);

        }
        // System.out.println(i); i loop da oluşturulmuş local variabledir
        // sadece loop içerisinde kullanilabilir.

        // static int sayiStatic=20;  static keyword sadece class levelde kullanilabilir.
        // methodlarin içersinde static veriable TANIMLANAMAZ.
    }

    public static void method1(){
        //System.out.println(sayi); sayi main method da oluşturulmuştur.local bir variable dir.
        // ve sadece main method da gecerlidir.

        int sayiMethod=20;
    }
}
