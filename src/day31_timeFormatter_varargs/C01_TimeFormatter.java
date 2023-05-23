package day31_timeFormatter_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+tarihsaat);
        //ilk olusturulan tarih : 2023-03-15T11:28:02.358
        // tarih i tanimladiktan sonra formati asagida ki gibi istedigimizi yapalim

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf.format(tarihsaat));//15/3/23 11:34 hh->12 saatlik

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");
        System.out.println(dtf1.format(tarihsaat));// 15/03/2023  11:34  HH->24 saatlik
    }
}
