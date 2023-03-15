package day04_dataCasting;

public class C04_Explicit {
    public static void main(String[] args) {
        int sayi1=50;
        short sayi2=(byte)sayi1;
        System.out.println(sayi2);

        /*
         geniş data türündeki değeri dar a atamak isterseniz java sizin geniş türün dara uyup uymayacağını
         çalıştırncaya kadar bilmez. ama risk almaz. riski sıfır a indirmek için burada bir sorun
         olursa sorumluluğu kabul etmeniz bekler. bunun için değerin önünü () içine istedeğimiz data
         türünü yazmamız yeterlidir
         bu riski üstlendiğimizde 3 durum oluşabilir

                1-) bizim değerimiz dar kalıp değerlerini uygun olursa hiç bir kayıp olmadan casting olur

                2-) double bir sayıyı int casting etemek gibi durumlarda data kaybı yaşabilir.virgülden sonra
                    kaybolur

                3-)geniş kalıbı dar kalıba koyduğumuzda sınırları aşan durumlar olduğunda veri başkalaşabilir
                int a=130------byte a= -126 olması gibi
        */
    }
}
