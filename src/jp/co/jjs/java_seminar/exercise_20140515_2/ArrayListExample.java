package jp.co.jjs.java_seminar.exercise_20140515_2;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("abcd"); // リストの最後に要素を追加
        list.add("defg");
        list.add("hijk");

        list.remove(0); // リストの指定した位置にある要素の削除

        System.out.println("要素数：" + list.size());

        System.out.println("要素：" + list.toString());
    }
}
