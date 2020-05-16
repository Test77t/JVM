package com.atguigu.jvm;

import java.util.ArrayList;
import java.util.List;
//-Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
public class GCOverHead {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true)
        {
            list.add(String.valueOf(++i).intern());
        }
    }
}
