package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java da bilgisayarimizdaki bir dosyaya erismek istiyorsak FileInputStream
        Class indan yardim aliriz. Ayni sekilde javadan bilgisisayarimizdaki bir
        dosya ekleme veya update yapmak istersek FileOutputStream Class indan
        yardim aliriz
         */

        FileInputStream fis =new FileInputStream("src/day39_exception/Test.txt");
        //Test.txt yi sag tus copy parh gir sec al yapistir

        /*
        Goruldugu gib compile time da altini kirmizi cizen her durum
        Comple Time Error degildir.
        Java da bazi exception lar da Compile Time Exception dir
        ozellikle dosya okuma yazma ile ilgili exception lar Compile Time Excepiion dur

        Compile Time Exception olustugunda java cozum icin 2 ihtimal önerir.
        1-trp catch ile cevrelemek
        2-method signature ina throws keyword ile beklenen exception turunu yazmak

        throws Exception sadece olayin farkinda oludugumuzun deklarasyonudur
        exception in handle edilmesinde hic bir rolu yoktur
        yani try catch ile kontrol altina aldigimiz exception da kod calismaya devam ediyordu.
        Ancak throws exception yazdigimizda java bir exception ile karsilasirsa hic bir sey
        yapmamıs gibi hata mesaji yayinlayip calismayi durdurur.
         */
    }
}
