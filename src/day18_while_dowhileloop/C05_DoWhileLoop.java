package day18_while_dowhileloop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        
        // 9 dan 190 a kadar 7 nin kati olan tum sayilari ekrana yazdırınz.

        int bas = 9;
        int bitis = 190;

        int temp = bas;
        //while loop
        while (temp < bitis) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

        System.out.println();

        // do while loop

        temp = bas;
        do {

                if (temp % 7 == 0) {
                    System.out.print(temp + " ");
                }
                temp++;

            } while (temp < bitis) ;
        }


}