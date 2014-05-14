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

        for(int i = 0; i < 50; i++){
            if(i % 2 == 0){
                std.increaseAns();
            }
        }

        System.out.println(std.ansewr);

    }
}
