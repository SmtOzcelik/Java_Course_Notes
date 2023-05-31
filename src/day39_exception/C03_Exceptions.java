package day39_exception;

public class C03_Exceptions {
    public static void main(String[] args) {
        String str="123a5";

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger sadece rakamlardan olusmalidir");
        }
        catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");
        }
        System.out.println("Sayinin karesi : "+sayi*sayi);

    /*
    Kullanicidan String olarak bir deger aliyor ve bunu integer a ceviriyorsak
    NumberFormatException ile karsilaşabilecegimizi ongoruruz NFE aldigimizda
    kodun durmamasini istiyorsak try catch ile cevreyebiliriz.

    Eger Bilmedigim bir exception daha olusursa kodum durmasin istiyorsak bir kere
    daha catch cumlesi ekleyip ona en genis Exception yazabiliriz
     */
    }


}
