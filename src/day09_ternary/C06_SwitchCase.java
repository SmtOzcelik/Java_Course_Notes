package day09_ternary;
public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün ismini alın hafta içi veya hafta sonu olduğunu yazdırın
        scanner istemeden çözelim.
        */

        String input="Sali";
        input=input.toLowerCase();  // böyle yazma sebebimiz girilen günün harf büyük olursa algılasin diye
        switch (input){
            case "pazartesi":
                System.out.println("hafta içi");
                break;
            case "sali":
                System.out.println("hafta içi");
                break;
            case "çarşamba":
                System.out.println("hafta içi");
                break;
            case "perşembe":
                System.out.println("hafta içi");
                break;
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lütfen geçerli bir gün girin");}
                // aşagıda kısa ikinci yol

                switch (input){
                    case "pazartesi":

                    case "sali":

                    case "çarşamba":

                    case "perşembe":

                    case "cuma":
                        System.out.println("hafta içi");
                        break;
                    case "cumartesi":

                    case "pazar":
                        System.out.println("hafta sonu");
                        break;
                    default:
                        System.out.println("lütfen geçerli bir gün girin");



                }
    }
}
