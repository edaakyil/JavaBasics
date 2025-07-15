package com.edaakyil.java.util.array.test;

import com.edaakyil.java.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilReversedTest {
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
            int[] arr2 = ArrayUtil.reversed(arr);

            ArrayUtil.printArray(arr, 2);
            ArrayUtil.printArray(arr2, 2);
            System.out.printf("arr and arr2 are %s%n", arr == arr2 ? "same array" : "different arrays");

            System.out.println("-------------------------------");
        }
    }
}
