package day26_constructor;

public class Ogretmen {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public Ogretmen() { // parametre yok ogretmen1 icin olusturduk
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim; // 5 parametre var ogretmen2 icin olusturduk
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim; // 3 parametre var ogretmen3 icin olusturduk
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {//bu metodu sag tus generate sonra to String sec
        return                // diger sayfa burdan otomatik cekiyor
                "\nisim = " + isim +
                " \nsoyisim = " + soyisim +
                "\ndogumTarihi = " + dogumTarihi +
                "\nbrans = " + brans +
                "\nyanBrans = " + yanBrans ;
    }
}
