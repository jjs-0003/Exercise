package jp.co.jjs.java_seminar.self_study.q3_1;

public class Exercise2 {
    public static void main(String[] args) {
        double dis = Double.valueOf(args[0]).doubleValue();
        String uni = args[1];


        if(uni.equals("feet")){
            dis /= 3.28;
            System.out.println("feet -> meter:" + dis + "m");
        }else if(uni.equals("meter")){
            dis *= 3.28;
            System.out.println("feet <- meter:" + dis + "feet");

        }else{
            System.out.println("nothing .");
        }
    }
}
