package day14_methodCreation;



public class C01_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 4 harfli bir stringi tersten yazdıran method oluştur

        terstenYazdir("Okan");   // aşağı metodu oluşturduk sonra burdan deger verdik.


    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3,4)+
                          input.substring(2,3)+
                          input.substring(1,2)+
                          input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazılısi:"+tersInput);
    }

}
