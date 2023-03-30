package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen iki sayiyi carpip sonucu bize donduran bir method olusturun

        int sayi1=10;
        int sayi2=20;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sayi1+" ile "+sayi2 +" sonucu :"+sonuc);
    }
    public static int carpGetir(int sayi1,int sayi2){
        int sonuc=sayi1*sayi2;
        return sonuc;

    }
}
