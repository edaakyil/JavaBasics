/**
 * Author: Eda Akyıl
 * User:edaakyil
 * Date:21.11.2024
 * Time:13:43
 */

package main.java.com.edaakyil.util.string.test;

import main.java.com.edaakyil.util.string.StringUtil;

import java.util.Scanner;

public class StringUtilPadLeadingTrailingTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Bir yazı giriniz: ");
            String s = kb.nextLine();

            if ("quit".equals(s))
                break;

            System.out.print("Bir sayı girini: ");
            int len = Integer.parseInt(kb.nextLine());

            System.out.printf("(%s)%n", s);
            System.out.printf("(%s)%n", StringUtil.padLeading(s, len));
            System.out.printf("(%s)%n", StringUtil.padLeading(s, len, 'x'));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, len));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, len, 'x'));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
