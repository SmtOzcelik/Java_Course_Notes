package day05_mat;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java cok güzel";
        str.toUpperCase();

        int sayi=10;
        // pirimitive data türlerinin yanında metod olmaz.
        //java metodları kulllanabilmemiz için her bir pirimitive
        // her bir data türü için wrapper class oluşturmuştur.

        Integer sayi2=10;  // pirimitive yi sarmaladı non-pirimitive dönüştürdü
        sayi2.longValue();  // ilk harfi büyük. dönüşüm sonrası yanina metod ekleyebiliyoruz.
    }
}
