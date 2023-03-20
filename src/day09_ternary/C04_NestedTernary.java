package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //kullanıcıdan bir harf isteyin. küçük harf ise consola "küçük harf",
        //büyük harfse consola "büyük harf" yoksa "girdiğiniz karakter harf değil "yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        // iç içe nestedTernay yapilabilir. 3 şartlı olur..
        String sonuc=(harf>='a'&& harf<'z')?("küçük harf"):((harf>='A'&&harf<'Z'?"Büyük harf":"Geçersiz Karakter"));
        System.out.println(sonuc);
    }
}
