package jp.co.jjs.java_seminar.exercise_20140515_5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Task> toDoList = new ArrayList<>();
        int cnt = 1;

        // タスクの登録
        toDoList.add(new Task("C++の復習"));
        toDoList.add(new Task("javaの復習"));
        toDoList.add(new Task("kitakaのチャージ"));
        toDoList.add(new Task("kitakaのチャージ"));
        toDoList.add(new Task("suica"));
        toDoList.add(new Task("kitakaのチャージ"));
        toDoList.add(new Task("復習"));

        // タスクの完了
        toDoList.get(0).setEnd();
        toDoList.get(1).setEnd();
        toDoList.get(2).setEnd();
        toDoList.get(3).setEnd();


        // タスクの一覧
        for (Task td : toDoList) {
            System.out.println(cnt + ". " + td.getTask() +td.getEnd());
            cnt++;
        }
    }

}
