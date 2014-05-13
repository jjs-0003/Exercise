package jp.co.jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {
    public static void main(String[] args) {
        int i;
        String[] str = { "Fizz", "Buzz", "FizzBuzz" };

        for (i = 1; i <= 30; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(str[2]);
            } else if (i % 5 == 0) {
                System.out.println(str[1]);
            } else if (i % 3 == 0) {
                System.out.println(str[0]);
            } else {
                System.out.println(i);
            }
        }
    }
}
