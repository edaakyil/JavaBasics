package com.edaakyil.java.util.string.test;

import com.edaakyil.java.util.string.StringUtil;

import java.util.Scanner;

public class StringUtilCountStringTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Birinci yazıyı giribiz: ");
            String s1 = kb.nextLine();

            if ("quit".equals(s1))
                break;

            System.out.print("İkinci yazıyı giriniz: ");
            String s2 = kb.nextLine();

            System.out.printf("Count: %d%n", StringUtil.countString(s1, s2));
            System.out.printf("Count: %d%n", StringUtil.countStringIgnoreCase(s1, s2));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
