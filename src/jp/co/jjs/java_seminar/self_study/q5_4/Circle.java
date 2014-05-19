package jp.co.jjs.java_seminar.self_study.q5_4;

public class Circle {

    double radius;
    double center;
    double xCenter;
    double yCenter;

    public Circle(double radius) {
        this.radius = radius;
        this.center = 0.0;
    }

    public Circle(double x, double y, double radius) {
        this.xCenter = x;
        this.yCenter = y;
        this.radius = radius;
    }
}
