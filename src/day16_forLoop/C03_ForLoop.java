package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        // 10 dahil ile 30 dahil arasındaki sayilari aralarinda
        // virgul olarak ayni satirda yazdirin.

        int bas=10;
        int son=30;

        for (int i = bas; i <=son ; i++) {

            if(i<son){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }

    }
}
