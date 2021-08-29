package com.learn.java;

import java.util.Arrays;

public class TestClass {
 
    public static void printArray(int arr[]) {
        Arrays.stream(arr)
                .forEach(System.out::println);
    }
}
