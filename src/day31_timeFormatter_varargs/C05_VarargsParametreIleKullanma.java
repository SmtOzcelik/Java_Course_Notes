package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(4,"Ali","Ayse","Ismail","Ahmet","SametFurkan");
    /*
     Varargs teorik olarak sonsuz sayida element alabilir.Bir method da parametre
     olarak varargs varsa varargs in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.oncesinde farkli parametreler olabilir.
     Ama varargs dan sonra parametre OLAMAZ.

     Bu kuraldan oturu bir method da sadece 1 varargs kullanilabilir

    */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String ... kelime) {

        String enUzunKelime=kelime[0];
        for (String each:kelime
        ) {
            if (each.length()>kelime.length){
                enUzunKelime=each;
            }

        }
        System.out.println("girilen kelimelerden en uzunu : "+enUzunKelime);
    }
}
