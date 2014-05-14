package jp.co.jjs.java_seminar.self_study.q4_1;

public class Exercise2 {

    public static void main(String[] args) {

        int count = 0;
        int x = 0;
        int y = 0;
        boolean done = true;

        if (count < 10) {
            if (!done) {
                System.out.println("running");
            }
            if (count == 5) {
                System.out.println("half way");
                x = y * 2;
            } else{         //  このelseはif(count == 5)に関連付けられる
                count++;
            }
        }
    }
}
