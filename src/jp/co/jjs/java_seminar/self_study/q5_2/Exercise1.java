package jp.co.jjs.java_seminar.self_study.q5_2;

public class Exercise1 {

    public static void main(String[] args) {

        Person person = new Person();

        person.name = "michel";
        person.year = 25;
        person.inMoney = 60000;


        System.out.println(person.name);
        System.out.println(person.year);
        System.out.println(person.inMoney);

        Sphere sphere = new Sphere();

        sphere.radius = 5;
        sphere.center = 2.5;
        System.out.println(sphere.radius);
        System.out.println(sphere.center);
    }
}
