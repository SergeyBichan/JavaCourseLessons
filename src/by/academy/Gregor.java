package by.academy;


import java.util.GregorianCalendar;

public class Gregor {
    public static void main(String[] args) {
        GregorianCalendar myC = new GregorianCalendar();
        System.out.println(myC.get(myC.YEAR) + ":"
        + myC.get(myC.MONTH) + ":" + myC.get(myC.DAY_OF_WEEK));


        String s7 = "JOY";
        s7.concat("12");
        System.out.println(s7);
    }



}
