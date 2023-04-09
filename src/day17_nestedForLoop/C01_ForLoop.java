package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Verilen string deki kullanılan harfleri tekrarsiz olarak yazdırıp
        kelime de kullanılan farklı harf sayisini veren bir metod yapınız
        */

        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }

    private static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islemKelime=input.replaceAll("\\W","");// Javaherzamanguzel
        System.out.print(islemKelime.substring(0,1)); // J yazdırdı
        benzersizInput+=islemKelime.substring(0,1); // benzersizInput icine J attı.

        for (int i = 1; i <=islemKelime.length()-1; i++) { // yukarıda ilk 0 ile aldık i=1 basla
            if(!benzersizInput.contains(islemKelime.substring(i,i+1))){
                System.out.print(","+islemKelime.substring(i,i+1));
                benzersizInput+=islemKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("inpt= "+input);
        System.out.println("benzersizinput="+benzersizInput);
    }

}
