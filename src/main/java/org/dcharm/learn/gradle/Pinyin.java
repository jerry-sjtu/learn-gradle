package org.dcharm.learn.gradle;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by wangqiang on 2016/1/8.
 */
public class Pinyin {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank(""));

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        System.out.println(optional(list));
    }

    public static List<String> optional(List<String> list) {
        if(list == null) return null;
        return list.stream().collect(Collectors.<String>toList());
    }
}
