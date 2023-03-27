package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        /*
        input olarak verilen 2 integer i toplayip sonucunu yazdırın
        bir metod olusturun
        */

        int input1=10;
        int input2=20;

        // method 4 adimda olusturulur.
        // 1.adım method call
        // 2.adim argument eklenmesi gerekiyorsa ekleyelim
        // eger method un return type void den farklı olacaksa bir
        //  variable olusturup,method call assign edelim.

        topla(input1,input2);
    }
    public static void topla(int input1, int input2) {
        // 3.adım method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir. (acces modifier,return Type vb..)
        // 4.adım eger return type void disinda bir seyse
        // return keywor u ve donecek degeri hesaplamalıyız
        System.out.println("Girilen iki sayinin toplamı:"+(input1+input2));
    }
}
