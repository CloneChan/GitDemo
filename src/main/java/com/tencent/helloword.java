package com.tencent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * helloword.java
 *
 * @Author: CZQ
 * @CreateTime: 9:54-2021/5/2
 * @Description:
 */
public class helloword {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        HashSet<Object> set = new HashSet<>();

        List<Object> collect = list.stream().distinct().collect(Collectors.toList());

        for (Object o : list) {
            set.add(o);
        }

        set.forEach(System.out::println);

    }
}
