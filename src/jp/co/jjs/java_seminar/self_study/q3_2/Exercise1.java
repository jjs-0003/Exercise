package jp.co.jjs.java_seminar.self_study.q3_2;

public class Exercise1 {
    public static void main(String[] args) {
        double num1 = Double.valueOf(args[0]).doubleValue();
        double num2 = Double.valueOf(args[1]).doubleValue();

        if(num2 == 0){
            System.out.println("a / 0!! Failure !!");
        }else{
            System.out.println(num1 / num2);
        }
    }
}
