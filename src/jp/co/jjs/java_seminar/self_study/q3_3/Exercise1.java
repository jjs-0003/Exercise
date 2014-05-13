package jp.co.jjs.java_seminar.self_study.q3_3;

public class Exercise1 {
    public static void main(String[] args) {
        int count = 0;

        //次のコードは正しい。
        for (count = 0; count < 110; count++) {
            if (count < 100) {
                System.out.println("Number is less than 100.");
                System.out.println("Tts square is " + count * count);
            }
        }
    }
}
