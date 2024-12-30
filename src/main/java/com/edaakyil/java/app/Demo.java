/**
 * Author:Eda Akyıl
 * User:edaakyil
 * Date:24.12.2024
 * Time:09:38
 */

package com.edaakyil.java.app;

public class Demo {
    public static void main(String[] args)
    {
        String s = String.format("%d4%c", 0, 'a');
        System.out.println(s.length());
        System.out.println(s.indexOf('a'));
        System.out.printf("(%s)%n", s);
        System.out.printf("(%4c)%n", 'a');
        System.out.println("--------------");

        String s1 = String.format("%" + 4 + "c", '0');
        String s2 = String.format("%0" + 4 + "d", 0);
        System.out.println(s1);
        System.out.println(s2);
    }


}
