package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu method String dondurdugu icin StringBuilder in eski halini degistiremez.
        System.out.println(sb);//Kayra

        sb.subSequence(0,3);
        System.out.println(sb);//Kayra
        // sonucu String dondurdugu icin atama yapmadigimiz icin sb de degisiklik yok

        System.out.println(sb.subSequence(0,3));//Kay
        // ama yazdir dersek istedigimizi veya atama yaparsak olur
    }
}
