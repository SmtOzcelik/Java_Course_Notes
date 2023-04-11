package day17_nestedForLoop;

public class C10_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=10;

        while (!dogruMu){
            if (sayi>20){
                System.out.println("bu islem tamam");
                dogruMu=true;
            }else {
                System.out.println("istenen sart saglanmadi "+sayi);
                sayi ++;
            }
        }

    }
}
