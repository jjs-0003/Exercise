package jp.co.jjs.java_seminar.self_study.q4_5;

public class Exercise2 {

    public static void main(String[] args) {

        for (int i = 100; i <= 200; i++) {
            int j;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
