package day25_constructor;

public class C01 {

    /*
    Java OOP konsept kullandiği için oluşturulan her bir class in ihtiyac
    oldugunda obje uretibilmesine uygun dizayn etmiştir.

    Ama her class dan obje uretilmeye bilir. Bunun icin java ihtiyac halinde
    kullanilmasi icin her class da default bir constructor koymuştur.

    Bu default constructor class dan obje oluşturuldugunda otomatik olarak calişir.

    Ornegin bu class da constructor gorulmemesine ragmen C02 class inda icinde
    oldugumuz C01 class indan obje uretebildik.
     */
    int sayi;

    public void deneme(){
        System.out.println("C01 den deneme method calişir");
    }

}
