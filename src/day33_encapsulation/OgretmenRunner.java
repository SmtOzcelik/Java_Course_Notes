package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tulay");// ogr1 ismi set edildi
        System.out.println(ogr1.getIsim());//ogr1 in ismi getirildi goruntulendi

        /*
        bu yöntemde data hiding degil daha anlasilir bir kod amaclanmis olur.
         */
    }
}
