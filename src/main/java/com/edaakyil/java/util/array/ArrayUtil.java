package com.edaakyil.java.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void fillRandomArray(int[] arr, Random random, int origin, int bound)
    {
        fillRandomArray(arr, random, origin, bound, arr.length);
    }

    public static void fillRandomArray(int[] arr, Random random, int origin, int bound, int count)
    {
        for (int i = 0; i < count; ++i)
            arr[i] = random.nextInt(origin, bound);
    }

    public static int[] generateRandomIntArray(Random random, int count, int origin, int bound)
    {
        int[] arr = new int[count];

        fillRandomArray(arr, random, origin, bound);

        return arr;
    }

    public static int max(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i)
            max = Math.max(arr[i], max);

        return max;
    }

    public static int min(int[] arr)
    {
        int min = arr[0];

        for (int i = 1; i < arr.length; ++i)
            min = Math.min(arr[i], min);

        return min;
    }

    public static void printArray(int [] arr)
    {
        printArray(arr, 1, arr.length);
    }

    public static void printArray(int [] arr, int al)
    {
        printArray(arr, al, arr.length);
    }

    public static void printArray(int [] arr, int al, int count)
    {
        printArray(arr, al, count, "", "\n");
    }

    public static void printArray(int [] arr, int al, int count, String sep, String end)
    {
        String fmt = String.format("%%0%dd%s ", al, sep);

        for (int i = 0; i < count; ++i)
            System.out.printf(fmt, arr[i]);

        System.out.print(end);
    }

    public static void reverse(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
            swap(arr, i, arr.length - 1 - i);
    }

    /*
    public static void reverse(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left < right)
            swap(arr, left++, right--);
    }
    */

    public static int[] reversed(int[] arr)
    {
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; --i)
            result[arr.length - 1 - i] = arr[i];

        return result;
    }

    public static int sum(int[] arr)
    {
        int total = arr[0];

        for (int i = 1; i < arr.length; ++i)
            total += arr[i];

        return total;
    }

    /*
    public static int[] reversed(int[] arr)
    {
        int len = arr.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++)
            result[i] = arr[len - 1 - i];

        return result;
    }
    */

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
