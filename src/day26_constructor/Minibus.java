package day26_constructor;

public class Minibus {

    public String marka="Marka girilmedi";
    public String model="Model girilmedi";
    public int yil=0;
    public int fiyat;


    public Minibus(String marka, String model, int yil, int fiyat) {
        this.marka = marka; // sag tus generate sec sonra constructor bas
        this.model = model; // minibus1 objesi icin gereklileri sec otomatik tanimlar
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Minibus() {
     // burasi da obje minibus icin olusturduk
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "\nmarka='" + marka + '\'' +
                "\n model='" + model + '\'' +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat +
                '}';
    }
}
