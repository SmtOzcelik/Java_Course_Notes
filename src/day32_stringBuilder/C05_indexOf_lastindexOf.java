package day32_stringBuilder;

public class C05_indexOf_lastindexOf {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay"));// 0 doner
        System.out.println(sb);//Pay attention please

        System.out.println(sb.indexOf("e"));//7 doner

        System.out.println(sb.indexOf("e", 10));//16 (10. indeksten sonra
                                                                //ilk e yi aldik)

        System.out.println(sb.lastIndexOf("e"));//19 sondan gel bul ama bastan say

        System.out.println(sb.lastIndexOf("e",10));//7
        // 10. indeksten basa dogru e yi bul ama bastan sal indek icin
    }
}
