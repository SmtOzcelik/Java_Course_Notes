package day17_nestedForLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {

        /*
        Verilen string i asagıdaki gibi yazdıran bir program yazınız.
         input=Deniz
         D
         De
         Den
         Deni
         Deniz
         */

        String input="Deniz";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print (input.substring(j-1,j)); // (0,1) ilk harf almak icin (j-1,j) yaptık

            }
            System.out.println("");

        }

    }
}
