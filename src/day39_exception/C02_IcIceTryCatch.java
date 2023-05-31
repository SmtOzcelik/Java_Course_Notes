package day39_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {

        int k;
        try {
            FileInputStream fis =new FileInputStream("src/day39_exception/Test.txt");
    // FileInputStream alti kırmızı oldu hata cıkma durumunu onlemek icin try-catch yaptik
            while ((k=fis.read()) !=-1){ //dosya okuma metodu
                // read alti kirmizi oldu 2.kez try-catch yaptik ic ice oldu
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi veya dosya bozuk");
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadi");
        }
    }
}
