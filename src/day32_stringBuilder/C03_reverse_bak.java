package day32_stringBuilder;

public class C03_reverse_bak {
    public static void main(String[] args) {
        // verilen bir input u tersine cevirip bize donuduren bir method olusturun

        String input="Hey gidi for loop gunleri";

        String tersInput=tersineCevir(input);

        System.out.println(tersInput); //irelnug pool rof idig yeH
    }

    public static String tersineCevir(String input) {

      StringBuilder sb=new StringBuilder(input);

      return sb.reverse().toString();
      /*
      geri donduren bi metod olusturduk methoda string gönderdik. kolaylik olsun
      diye reverse() yi kullanmak icin input u StringBuilder da tanimladik
      reverse yi kullandik fakat geri gidip kabul olmasi icin tekrar string e
      donmek gerekiyor bizde toString ekleyerek return yaptik
       */









    }
}
