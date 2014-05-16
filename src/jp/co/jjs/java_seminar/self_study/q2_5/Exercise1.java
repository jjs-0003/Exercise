package jp.co.jjs.java_seminar.self_study.q2_5;

public class Exercise1 {

    public static void main(String[] args) {

        Integer i1 = new Integer(5);
        Integer i2 = new Integer("5");

        if(i1.equals(i2)){
            System.out.println("同値");
        }
    }
}
