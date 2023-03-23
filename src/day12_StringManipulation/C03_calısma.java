package day12_StringManipulation;

public class C03_calısma {
    public static void main(String[] args) {

        String str="Rab*-bim 12ben=i af!+fet";

        // Rabbim beni affet e çevir
        // önce boşlukları öldürmemek için harf değeri atayalım

        str=str.replaceAll(" ","asd");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        str=str.replaceAll("asd"," ");
        System.out.println(str);

    }
}
