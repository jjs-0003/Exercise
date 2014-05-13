package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_2 {
    public static void main(String[] args) {
        String week = "水";

        System.out.print("今日は" + week + "曜日です。");
        if (week.equals("日")) {
            System.out.println("二度寝します。");
        } else if (week.equals("月")) {
            System.out.println("布団から出たくないです。");
        } else if (week.equals("火")) {
            System.out.println("火曜市があります。");
        } else if (week.equals("水")) {
            System.out.println("やっと週の真ん中です。");
        } else if (week.equals("木")) {
            System.out.println("土日まであと二日です。");
        } else if (week.equals("金")) {
            System.out.println("今日が終われば休みです！。");
        } else if (week.equals("土")) {
            System.out.println("起きたら昼です。");
        }
    }
}
