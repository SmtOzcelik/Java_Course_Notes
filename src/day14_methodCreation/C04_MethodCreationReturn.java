package day14_methodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {

        // verilen isim ve soyismi ilk harfi buyuk geriye kalanarı * olacak şekilde
        // değiştirip bize bu halini donduren bir metod olusturun
        // not programin ilerleyen kısımlarında isim ve soyismi busekilde kullanmak istiyoruz

        String isim="Enes";
        String soyisim="Bozkurt";
        // oluşturduğumuz isimGizle(isim,soyisim) metodunu bi string e atıyoruz ki
        // geri döndürebilelim hem eski veriyi hem yeni veriyi saklayabilelim
        // eski veri Enes Bozkurt olacak yenisi ise E**** B***** olacak
        String gizliIsim=isimGizle(isim,soyisim);

        System.out.println(isim+" "+soyisim); // Enes Bozkurt
        System.out.println(gizliIsim); // E*** B******


    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim; // döndürme işlemi yaptık yazdırma işlemini buraya değil
                                // yukarı da ki metod un içine yazabileceğiz.
                                // bu sayede kalıcı olacak
    }

}
