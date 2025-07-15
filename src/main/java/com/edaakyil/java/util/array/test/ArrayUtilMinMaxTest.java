package com.edaakyil.java.util.array.test;

import com.edaakyil.java.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilMinMaxTest {
    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Input a number: ");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            int[] arr = ArrayUtil.generateRandomIntArray(random, random.nextInt(5, 11), 0, 100);

            ArrayUtil.printArray(arr, 2);
            System.out.printf("Minimum: %d%n", ArrayUtil.min(arr));
            System.out.printf("Maximum: %d%n", ArrayUtil.max(arr));

            System.out.println("-------------------------------");
        }
    }
}
