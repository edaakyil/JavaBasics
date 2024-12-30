package com.edaakyil.java.app;

import java.util.Scanner;

class Main {
    public static void main(String [] args)
    {
        System.out.println(repeat3('a', 10));
//        String s = String.format("%%0%ds", 5);
//        String f = String.format("%%0%dd%%s", 3);
//        String g = String.format("%%0%d%%c", 3);
//        System.out.println(s);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.printf(f, 8, "sep");
//        System.out.println();
//        System.out.printf(g, 'd');
//        System.out.println();
//        System.out.printf(s, "a");

        //String fmt = String.format("%%0%dd%%s", n);


            //System.out.printf(fmt, a[i], sep);


        //TrimLeadingTrailingTest.run();
    }

    public static String repeat3(char ch, int count)
    {
        //String fmt = "%%0%dd%%s".format(count); // n == 2 ise "%02d%s"
        // val fmt = if (n > 0) "%%0%dd%%s".format(n) else "%d%s"
        //String fmt = "%%0%dd%%s".format(count < 1 ? 1 : count)
        String s = String.format("%%0%dd", count);
        return String.format(s, 0).replace('0', ch);
    }
}

class TrimLeadingTrailingTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.printf("(%s)%n", s);
            System.out.printf("(%s)%n", Util.trim(s));
            System.out.printf("(%s)%n", Util.trimLeading(s));
            System.out.printf("(%s)%n", Util.trimTrailing(s));
        }
    }
}

class Util {
    public static String trim(String s)
    {
        return trimTrailing(trimLeading(s));
    }

    public static String trimLeading(String s)
    {
        int i = 0;
        while (Character.isWhitespace(s.charAt(i)))
            ++i;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i = s.length() - 1;
        while (Character.isWhitespace(s.charAt(i)))
            --i;

        return s.substring(0, i + 1);
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	- İki yazının aynı (özdeş) olup olmadığı == veya != operatörü ile karşılaştırılamaz
	- İki yazının aynı olup olmadığının karşılaştırılması için equals metodu kullanılabilir. equals metodu case-sensitive'dir
	- case-insensitive bir özdeşlik karşılaştırması için equalsIgnoreCase metodu kullanılabilir.
----------------------------------------------------------------------------------------------------------------------*/