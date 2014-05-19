package jp.co.jjs.java_seminar.self_study.q5_4;

public class Sphere {

    double radius;
    double xPoint;
    double yPoint;
    double zPoint;

    public Sphere() {
        this.radius = 1;
        xPoint = yPoint = zPoint = 0;
    }

    public Sphere(double radius){
        this.radius = radius;
        this.xPoint = this.yPoint = this.zPoint = 0;
    }

    public Sphere(double radius, double xPoint, double yPoint, double zPoint) {
        super();
        this.radius = radius;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.zPoint = zPoint;
    }


}
