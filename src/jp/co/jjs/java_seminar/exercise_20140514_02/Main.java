package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {
    public static void main(String[] args) {
        Student std = new Student(1, "man", "Taro Sapporo", 22);

        System.out.println("Student ID:" + std.id);
        System.out.println("Student Sex:" + std.sex);
        System.out.println("Student Name:" + std.name);
        System.out.println("Student Year:" + std.year);
        System.out.println("Student PhonNum:" + std.phonNum);
        System.out.println("Student Adrress:" + std.address);
        System.out.println(std.isAttendance);

        if(std.isAttendance == true){
            System.out.println("出席しています");
        }else{
            System.out.println("出席していません");
        }


        for(int i = 0; i < 5; i++){
            std.increaseAns();
        }

        System.out.println(std.report());

    }
}
