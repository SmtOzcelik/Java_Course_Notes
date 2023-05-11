package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
       this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        Bizim temel amacımız KamyonRunner da argument olarak girilen degerin
        Kamyon class inda instance variable a atanmasi
        Ancak scope konusunda ogrendigimiz gibi Komyon Canstructor scope unda marka oldugu icin
        instance marka ya gitmiyor

        Bu karisikligi gidermek icin instance variable lari belirli hale getirmemiz lazım
        java bunun icin this keyword u olusturmustur.

        Genel kullanim acisindan this keyword u kodu herkesin anlamasini kolaylastirdigi
        icin tercih edilir.
         */
    }

    public Kamyon(){

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() { // bu methodu otomatik oluştururken sag tuş generate
        return "" +     // sonra toString yap hepsini sec ok yap
                "\nmarka=" + marka + '\'' +
                " \nmodel='" + model + '\'' +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat  ;
    }
}
