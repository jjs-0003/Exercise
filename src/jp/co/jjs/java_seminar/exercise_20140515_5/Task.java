package jp.co.jjs.java_seminar.exercise_20140515_5;

public class Task {

    private String taskName; // タスク名
    private boolean end = false; // タスクの状態

    // コンストラクタ
    public Task(String task) {
        this.taskName = task;
    }

    // タスク状態の変更
    public void setEnd() {
        this.end = true;
    }

    // タスク状態の取得
    public String getEnd() {
        // タスクが変更されているかどうか判別
        if (this.end == true) {
            return "(Done)";
        } else {
            return " ";
        }
    }

    // スケジュールの取得
    public String getTask() {
        return this.taskName;
    }

}
