package com.kt.javaoop;

import com.kt.javaoop.logic.BubbleSort;

import java.util.Arrays;

/**
 * Created By Cheetah on 2022-12-01.
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
