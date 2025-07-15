package com.edaakyil.java.util.array.test;

import com.edaakyil.java.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilReverseTest {
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
            ArrayUtil.reverse(arr);
            ArrayUtil.printArray(arr, 2);

            System.out.println("-------------------------------");
        }
    }
}
