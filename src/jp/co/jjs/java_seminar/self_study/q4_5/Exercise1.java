package jp.co.jjs.java_seminar.self_study.q4_5;

public class Exercise1 {

    public static void main(String[] args) {

        for (int h = 0; h < args.length; h++) {
            if (args[h] != null) {
                for (int i = 0; i < args[h].length(); i++) {
                    System.out.println(args[h]);
                }
            }
        }
    }
}
