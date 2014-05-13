package jp.co.jjs.java_seminar.self_study.q1_11;

public class Exercise1_11_2 {
    public static void main(String[] args) {
        int dist = 3000;
        int spd = 75;
        int time;

        time = dist / spd;

        System.out.println("NewYork と Los Angels間でかかる時間は時速" +
                          spd + "マイルで" + time + "時間です。");

    }
}
