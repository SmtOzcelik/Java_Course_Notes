package day26_constructor;

public class Araba {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
    marka=markaR;
    model=modelR;   // burasi Araba parametreli constructor
    yil=yilR;       // araba2 ve araba3 objesi nin yeri
    fiyat=fiyatR;
    }
    /*
    Biz herhangi bir constructor olusturdugumuzda Java default constructor u siler.
    Eger biz projemizde bir sorun yasanmasini istemiyorsak mutlaka default constructor
    yerine parametresiz bir constructor olusturmaliyiz.
     */

    public Araba(){
                   // burasi Araba parametresiz constructor
                   // araba1 objesinin yeri
    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba "+hiz+" km hiz yapar ");
    }


    public static class Kamyon {
    }
}
