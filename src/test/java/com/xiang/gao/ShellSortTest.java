package com.xiang.gao;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

/**
 * @author Administrator
 * @crdate 2017-10-09 14:34
 */

public class ShellSortTest {

    private String a;

    public static void main(String[] args) {


        // Random random = new Random(47);
        // int nextInt = random.nextInt(100);
        // System.out.println(nextInt);
        // Random random1 = new Random(47);
        // int nextInt1 = random1.nextInt(100);
        // System.out.println(nextInt1);

        String s = RandomStringUtils.randomNumeric(3);
        int random1 = (int) (Math.random() * 100);
        for (int i = 0; i < 3; i++) {
            Random random = new Random(47);

            int nextInt = random.nextInt(100);
            int nextInt2 = random.nextInt(100);
            int nextInt3 = random.nextInt(100);
            System.out.println(nextInt);
            System.out.println(nextInt2);
            System.out.println(nextInt3);
            System.out.println("-------");
        }
        System.out.println(random1);
        System.out.println(s);

    }


}
