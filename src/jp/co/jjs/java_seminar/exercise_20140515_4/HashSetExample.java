package jp.co.jjs.java_seminar.exercise_20140515_4;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> hS = new HashSet<>();

        hS.add("hokkaido");
        hS.add("sapporo");
        hS.add("aaa");
        hS.add("aaa");

        hS.remove("sapporo");

        System.out.println(hS);
    }
}
