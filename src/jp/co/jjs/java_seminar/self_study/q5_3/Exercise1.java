package jp.co.jjs.java_seminar.self_study.q5_3;

public class Exercise1 {

    public static void main(String[] args) {

        Person person = new Person("michel", 24, 700000);

        System.out.println(person.getName());
        System.out.println(person.getYear());
        System.out.println(person.getInMoney());


        Sphere sphere = new Sphere(5, 0.1);

        System.out.println(sphere.getRadius());
        System.out.println(sphere.getCenter());
    }
}
