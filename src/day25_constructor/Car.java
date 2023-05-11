package day25_constructor;

public class Car {
    /*
    Bu class bizim kaliphanemiz.
    Bir araba olusturmak icin ihtiyacımız olan variable ve method lari bu class da belirleriz.
    Sonra farkli class larda araba olusturmamız gerekirse bu class dan obje olusturup
    burada belirlenen variable ve method lara gore araba uretir.
    */

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba "+hiz+" km hiz yapar ");
    }


}
