package day15_overloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        C06_StringTerseCevirme.terstenYazdir("zekeriya");// onceki ders deneme

        //100 den 1 e kadar sınırlar dahil 8 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >= 0; i--) {
            if(i%8==0){
                System.out.print(i+" "); // println alt alta , print yan yana yazdırır

        }

    }

}}
