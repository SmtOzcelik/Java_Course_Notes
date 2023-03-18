package day07_Ifstatemens;

import java.util.Scanner;

public class C07_IfElseIfStatement {
    public static void main(String[] args) {

        /*
        Kullanıcıya yaşını sorun 65 den küçükse "emekli olamazsın,çalışmalısın daha çalışmalısın"
        eğer 65 büyükse "emekli olmalısın,çalışamazsın" yazdırın. negatif değer verilirse uyarın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");


        int yas=scan.nextInt();
        if(yas<0){
            System.out.println("Lütfen geçerli bir sayı giriniz");}
        else if(yas<65){
            System.out.println("Emekli olamazsın," +(65-yas)+" yıl daha çalışmalısın.");}else{
            System.out.println("Emekli olabilirsin,çalaşamazsın");}
    }
}
