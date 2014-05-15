package jp.co.jjs.java_seminar.self_study.q4_8;

public class BadSwitch {

    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        switch (Integer.parseInt(args[0])) {
        case i:
            System.out.println("1"); // case式は定数式でなければいけません
            break;
        case j:
            System.out.println("2");// case式は定数式でなければいけません
            break;
        default:
            System.out.println("Default");
        }
    }

}
