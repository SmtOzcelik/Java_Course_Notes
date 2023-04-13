package day18_while_dowhileloop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan baslangıc ve bitis harflerini alin ve baslangıc harfinden
        baslayip bitis harfinde biten tum buyuk harf olarak ekrana yazdırın
        kullanıcıdan hata yapmadıgini farz edin.
        */

        char ilkharf='f';
        char sonharf='t';
        String buyult="";

        char temp=ilkharf; // ilk harfi bozmamak icin
        while (temp<=sonharf){

            buyult=(temp+"").toUpperCase(); // char olan temp i string olan buyult e cevirmek ve
                                            // touppercase kullanmak icin "" kullandik stringlestirdik
            System.out.print(buyult+" ");
            temp+=1;

        }

    }
}
