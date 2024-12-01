/**
 * Author: Eda Akyıl
 * User:edaakyil
 * Date:6.11.2024
 * Time:17:38
 */

package main.com.edaakyil.java.util.string.test;

import main.com.edaakyil.java.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class StringUtilGenerateRandomTextTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            System.out.printf("Text: %s%n", StringUtil.generateRandomTextEN(random, count));
            System.out.printf("Yazı: %s%n", StringUtil.generateRandomTextTR(random, count));
            System.out.println("------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
} 
