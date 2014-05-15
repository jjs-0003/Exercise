package jp.co.jjs.java_seminar.exercise_20140515_1;


public class RapperTest {

    public static void main(String[] args) {
        String s1 = "123";
        int i = Integer.valueOf(s1).intValue();

        System.out.println(i);

        String s2 = "1343.222";
        double d = Double.valueOf(s2).doubleValue();

        System.out.println(d);

        String s3 = "2341";
        Integer obj = Integer.valueOf(s3);
        int i2 = obj.intValue();

        System.out.println(i2);

        int s4 = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(s4));
    }
}
