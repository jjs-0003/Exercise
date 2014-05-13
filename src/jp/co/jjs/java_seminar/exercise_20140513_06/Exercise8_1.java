package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {
    public static void main(String[] args) {
        String week = "火";

        System.out.print("今日は" + week + "曜日です。");
        switch (week) {
        case "日":
            System.out.println("二度寝します。");
            break;
        case "月":
            System.out.println("布団から出たくないです。");
            break;
        case "火":
            System.out.println("火曜市があります。");
            break;
        case "水":
            System.out.println("やっと週の真ん中です。");
            break;
        case "木":
            System.out.println("土日まであと二日です。");
            break;
        case "金":
            System.out.println("今日が終われば休みです！。");
            break;
        case "土":
            System.out.println("起きたら昼です。");
            break;

        default:
            break;
        }
    }
}
