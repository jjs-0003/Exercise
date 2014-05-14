package jp.co.jjs.java_seminar.self_study.q3_4;

public class Exercise3 {

    public static void main(String[] args) {

        double num = Double.valueOf(args[0]).doubleValue();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

    }
}
