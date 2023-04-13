package day18_while_dowhileloop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=665432;
        int rakamlartoplam=0;
        int birlerbasamagi=0;
        int temp=input;

        while (temp>0){
            birlerbasamagi=temp%10;
            rakamlartoplam += birlerbasamagi;
            temp/=10;
        }
        System.out.println(input+" sayisinin rakamlar toplami: "+rakamlartoplam);


    }
}
