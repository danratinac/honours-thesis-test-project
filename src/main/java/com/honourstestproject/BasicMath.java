package com.honourstestproject;

public class BasicMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int b, int a) {
        return b - a;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public void noGood() {
        Number[] arr = new Integer[10];
        arr[0] = 1.0;
    }
}
