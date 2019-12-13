package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date date =new Date();
        DateFormat df;
        df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.JAPAN);  // getDateInstance показывает число, месяц ,год
        df=DateFormat.getTimeInstance(DateFormat.SHORT,Locale.JAPAN); //getTimeInstance показывает время
        System.out.println("Япония: " +df.format((date)));
        df = DateFormat.getTimeInstance(DateFormat.LONG,Locale.UK);
        System.out.println("Великобритания: "+df.format(date));
        df = DateFormat.getTimeInstance(DateFormat.FULL,Locale.CANADA);
        System.out.println("Канада: "+df.format(date));
    }
    /*
    келасс dataformat является обстрактным классом
    */
}
