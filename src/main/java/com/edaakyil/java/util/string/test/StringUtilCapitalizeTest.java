/**
 * Author: Eda Akyıl
 * User:edaakyil
 * Date:11/18/2024
 * Time:7:04 PM
 */

package com.edaakyil.java.util.string.test;

import com.edaakyil.java.util.string.StringUtil;

import java.util.Scanner;

public class StringUtilCapitalizeTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Input a text: ");
            String s = kb.nextLine();

            if ("quit".equals(s))
                break;

            System.out.println(StringUtil.capitalize(s));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
