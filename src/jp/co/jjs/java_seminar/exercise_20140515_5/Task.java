package jp.co.jjs.java_seminar.exercise_20140515_5;

public class Task {

    int sum = 0;
    String taskName; // タスク名
    boolean end = false; // タスクの状態

    // コンストラクタ
    public Task(String task) {
        this.taskName = task;
        sum++;
    }

    // タスク状態の変更
    public void endTask() {
        this.end = true;
    }

    // タスク状態の取得
    public String getEnd() {
        //タスクが変更されているかどうか判別
        if (this.end == true) {
            return "(Done)";
        }else{
            return " ";
        }
    }

    // スケジュールの取得
    public String getTask() {
        return this.taskName;
    }

    public void show(){
        for(int i = 0; i < sum; i++){
            System.out.println(i + ". " + getTask() + getEnd());
        }
    }
}
