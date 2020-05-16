package com.atguigu.jvm;

public class StackOver {
    public static void main(String[] args) {
        Loop();
    }

    private static void Loop() {
        Loop();
    }
}
