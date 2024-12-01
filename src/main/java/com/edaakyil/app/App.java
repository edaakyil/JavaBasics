package main.java.com.edaakyil.app;

import java.util.Scanner;

class Main {
    public static void main(String [] args)
    {
        TrimLeadingTarilingTest.run();
    }
}

class TrimLeadingTarilingTest {
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