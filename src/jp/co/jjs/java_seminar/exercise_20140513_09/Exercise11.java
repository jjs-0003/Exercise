package jp.co.jjs.java_seminar.exercise_20140513_09;

public class Exercise11 {
    public static void main(String[] args) {
        int buy = 3480;
        int pay = 5000;
        int turi = 0;

        turi = pay - buy;

        System.out.println("買い物した金額：" + buy);
        System.out.println("支払った金額：" + pay);

        System.out.println("10000円：" + (turi / 10000));
        turi -= 10000 * (turi / 10000);
        System.out.println("5000円：" + (turi / 5000));
        turi -= 5000 * (turi / 5000);
        System.out.println("2000円：" + (turi / 2000));
        turi -= 2000 * (turi / 2000);
        System.out.println("1000円：" + (turi / 1000));
        turi -= 1000 * (turi / 1000);
        System.out.println("500円：" + (turi / 500));
        turi -= 500 * (turi / 500);
        System.out.println("100円：" + (turi / 100));
        turi -= 100 * (turi / 100);
        System.out.println("50円：" + (turi / 50));
        turi -= 50 * (turi / 50);
        System.out.println("10円：" + (turi / 10));
        turi -= 10 * (turi / 10);
        System.out.println("5円：" + (turi / 5));
        turi -= 5 * (turi / 5);
        System.out.println("1円：" + (turi / 1));
        turi -= 1 * (turi / 1);

    }
}
