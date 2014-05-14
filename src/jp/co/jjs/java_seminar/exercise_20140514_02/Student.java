package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {
    int id; // 生徒のID
    String sex; // 性別
    String name; // 名前
    int year; // 年齢
    String phonNum; // 電話番号
    String address; //住所
    boolean isAttendance ; // 出席状態
    int ansewr; // 解いた問題数

    //コンストラクタ
    public Student(int id, String sex, String name, int year) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    // 出席している
    public void attend() {
        isAttendance = true;
    }

    // 欠席している
    public void absence() {
        isAttendance = false;
    }

    //問題がとかれたらカウントアップ
    public void  increaseAns(){
        this.ansewr++;
    }
}
