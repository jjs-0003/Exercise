package jp.co.jjs.java_seminar.self_study.q5_4;

public class Exercise1 {

    public static void main(String[] args) {
        Circle cr = new Circle(2);
        System.out.println(cr.center);
        System.out.println(cr.radius);

        Circle cr2 = new Circle(1, 5, 2);

        System.out.println(cr2.center );
        System.out.println(cr2.xCenter);
        System.out.println(cr2.yCenter);


    }
}
