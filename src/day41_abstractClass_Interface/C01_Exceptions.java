package day41_abstractClass_Interface;

public class C01_Exceptions {
    public static void main(String[] args) {
        try {
            calis();
        }catch (Exception e){

            System.out.println(e.getMessage());
        }
    }
            private static void calis(){
                throw new RuntimeException("cokkk calis");


    /*
    throw ile kontrollu exception olusturulurken parametre olarak
    istegimiz hata mesajini girimebiliriz
     */
            }


}
