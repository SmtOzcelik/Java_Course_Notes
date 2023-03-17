package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcadan ismini isteyin.
        //girilen ismi
        //isminiz:ismail    şeklinde yazdıralım

        // 1- scanner objesi oluşturalım
        Scanner scan =new Scanner(System.in);

        //2- kullanıcıya ne istediğimizi söyleyelim
        System.out.printf("lütfen isminizi girin");

        //3- oluşturduğumuz scan objesi ile kullunıcıngirdiği değeri alıp
        //oluşturacağımiz uygun bir variabe e atayalım
        String kullanıcıismi=scan.next();
        System.out.println("isminiz:"+kullanıcıismi);

    }
}
