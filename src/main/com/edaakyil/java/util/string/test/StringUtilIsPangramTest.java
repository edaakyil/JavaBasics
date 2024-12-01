/**
 * Author: Eda Akyıl
 * User:edaakyil
 * Date:19.11.2024
 * Time:15:08
 */

package main.com.edaakyil.java.util.string.test;

import java.util.Scanner;

import main.com.edaakyil.java.util.string.StringUtil;

class App {
    public static void main(String [] args)
    {
        StringUtilIsPangramTest.run();
    }
}

class StringUtilIsPangramTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        StringUtilIsPangramTRTest.run(kb);
        StringUtilIsPangramENTest.run(kb);
    }
}

class StringUtilIsPangramTRTest {
    public static void run(Scanner kb)
    {
        while (true) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;

            System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");
        }
    }
}


class StringUtilIsPangramENTest {
    public static void run(Scanner kb)
    {
        while (true) {
            System.out.print("Input a text:");
            String s = kb.nextLine();

            if ("quit".equals(s))
                break;

            System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a Pangram");
        }
    }
}

