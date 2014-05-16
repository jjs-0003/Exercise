package jp.co.jjs.java_seminar.exercise_20140516_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Task> toDoList = new ArrayList<>();

        // タスクの登録
        toDoList.add(new Task("C++の復習"));
        toDoList.add(new Task("javaの復習"));
        toDoList.add(new Shopping("kitakaのチャージ", 1000));
        toDoList.add(new Shopping("kitakaのチャージ", 2000));
        toDoList.add(new Task("suica"));
        toDoList.add(new Shopping("kitakaのチャージ", 10000));
        toDoList.add(new Task("復習"));

        // タスクの完了
        toDoList.get(0).setEnd();
        toDoList.get(1).setEnd();
        toDoList.get(2).setEnd();
        toDoList.get(3).setEnd();

        // タスクの一覧
        for (Task td : toDoList) {
            td.show();
        }
    }

}
