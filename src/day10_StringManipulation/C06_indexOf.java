package day10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzeldir.";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // bana integer döndürüyor. olmayan karakter -1

        // int de yok diye bir değer bulunmuyor.
        // 0 dersek j nin index i dir.
        // - bir değer dönerse bir aranan string in str de olmadığını anlarız
        // java -1 döndürmeyi tercih etmiştir.

        String str5 = "wertyuio;lsdfgpoinuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";
        if (str5.indexOf("p")==-1) {
            System.out.println("str5 de istenen karakter kullanılmamıştır.");
        }else{
            System.out.println("str5 de istenen karakter kullanılmis");
        }
        System.out.println(str5.length()-1); // indeks sayısı 58
        System.out.println(str5.charAt(str5.length()-4)); // sondan 4. harf g dir.
    }}