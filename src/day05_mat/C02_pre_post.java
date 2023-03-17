package day05_mat;

public class C02_pre_post {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre_increment="+ ++sayi);//artır yazdır sayi=11

        System.out.println("post_increment="+ sayi++);// sayi=11yazdır sonra
                                                        // 1 artır. sayi=12 oldu
                                                        // hafızada sayi=12

        System.out.println("post_incremet den sonra="+sayi); // sayi=12 yazdır

    }
}
