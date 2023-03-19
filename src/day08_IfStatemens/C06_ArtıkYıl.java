package day08_IfStatemens;

import java.util.Scanner;

public class C06_ArtıkYıl {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yılınızı yazınız.");
        int yil=scan.nextInt();
        if(yil%4!=0){
            System.out.println("Artık yıl değil");
        }else if(yil%100!=0){
            System.out.println("Artık yıl");
        }else if (yil%400!=0){
            System.out.println("Artık yıl değil");
        }else {
            System.out.println("Artık yıl");
        }

    }
}
