package day12_StringManipulation;

public class C01_Raplece {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ","")); // boşlulları kapattık

        // hava kelimeisin java yapalım.
        System.out.println(str.replace("h","j"));

        // hava kelimesini java yapılm ve boşluklarıda kapatalım
        System.out.println(str.replace("h","j").replace(" ",""));

        // guz el yerine harika yapalım.
        System.out.println(str.replace("guz el","harika"));

        // cumleyi replace kullanarak Bugun "Java cok guzel" yapalım.
        // arka arkaya replace yapılabilir.

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");
        System.out.println(str);





    }
}
