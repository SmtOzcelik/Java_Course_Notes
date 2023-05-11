package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1 "+ ogretmen1);// to String yazmayabiliriz

       Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","01/01/1989","Matematik","FenBilgisi");
        System.out.println("Ogretmen2 : "+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Ayse","Kara","12/09/1989");
        System.out.println("Ogretmen3 : "+ogretmen3);

    }
}
