package com.edaakyil.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input a text: ");
        String s1 = kb.nextLine();

        System.out.print("Input a text: ");
        String s2 = kb.nextLine();

        System.out.println(s1 == s2 ? "AYNI" : "FARKLI");
        System.out.println(s1.equals(s2) ? "AYNI" : "FARKLI");
        System.out.println(s1.equalsIgnoreCase(s2) ? "AYNI" : "FARKLI");

        String s = s1.concat(s2);

        System.out.printf("s1: %s%n", s1);
        System.out.printf("s2: %s%n", s2);
        System.out.printf("s: %s%n", s);

        System.out.println("-----------------------------------");

        String text1 = "ankara";
        String text2 = "ankara";

        System.out.println(text1 == text2 ? "AYNI" : "FARKLI");


    }
}


/*----------------------------------------------------------------------------------------------------------------------
	- İki yazının aynı (özdeş) olup olmadığı == veya != operatörü ile karşılaştırılamaz
	- İki yazının aynı olup olmadığının karşılaştırılması için equals metodu kullanılabilir. equals metodu case-sensitive'dir
	- case-insensitive bir özdeşlik karşılaştırması için equalsIgnoreCase metodu kullanılabilir.
----------------------------------------------------------------------------------------------------------------------*/