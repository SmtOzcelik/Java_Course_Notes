package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // ilk harf yazdırır.
        System.out.println(str.toUpperCase().charAt(7));

        // 7. karakteri büyük harfle yazdırır R. boşlukta bi karakter sayılır.
        //str touppercase ile tamamen büyük harfe dönmedi çünkü atama yapmadık

        System.out.println(str.charAt(21));// l

       /* System.out.println(str.charAt(22)); //StringIndexOutOfBoundsException hata kodu verdi senin
       indeksin uzunluğun yetmedi.
       eğer index olarak uzunluğu veya daha bir sayiyi girirsek java exception verir.

       charAt() kullandığımızda sonuc char olacaği için artik manipulation yapamayiz.
       string method larından kullanmamız gereken bir metod varsa charAt() den önce kullanmalıyız.
        */
    }
}
