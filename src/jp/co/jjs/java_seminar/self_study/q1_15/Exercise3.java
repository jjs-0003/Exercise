package jp.co.jjs.java_seminar.self_study.q1_15;

public class Exercise3 {
    public static void main(String[] args) {
        double sum = 0;
        double[] d = new double[4];
        d[0] = 1.0;
        d[1] = 2.03;
        d[2] = 31.002;
        d[3] = 10.054;

        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        System.out.println("平均値：" + sum / d.length);

    }
}
