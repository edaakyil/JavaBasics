package com.edaakyil.java.util.string.test;

import com.edaakyil.java.util.string.StringUtil;

import java.util.Scanner;

public class StringUtilReverseTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Input a text: ");
            String text = kb.nextLine();

            if ("quit".equalsIgnoreCase(text))
                break;

            System.out.printf("Reversed text: %s%n", StringUtil.reverse(text));
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
