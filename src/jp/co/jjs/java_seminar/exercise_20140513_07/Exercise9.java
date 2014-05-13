package jp.co.jjs.java_seminar.exercise_20140513_07;

public class Exercise9 {
    public static void main(String[] args) {
        int i = 1;
        int[] a = { 0, 1, 2, 3, 4, 5 };
        int[] b = new int[3];
        b[0] = 0;
        b[1] = 1;
        b[2] = 2;

        System.out.println("a要素数：" + a.length);
        System.out.println("a[" + i + "] = " + a[i]);
        System.out.println("b要素数：" + b.length);
        System.out.println("b[" + i + "] = " + b[i]);

        String[] c = { "abc", "defghi" };
        String[] d = new String[3];
        d[0] = "abc";
        d[1] = "def";
        d[2] = "ghi";

        System.out.println("c要素数：" + c.length);
        System.out.println("c[" + i + "] = " + c[i]);
        System.out.println("d要素数：" + d.length);
        System.out.println("d[" + i + "] = " + d[i]);
    }
}
