package jp.co.jjs.java_seminar.self_study.q4_8;

public class Exercise2 {

    public static void main(String[] args) {

        switch (Integer.parseInt(args[0])) {
        case 1:
            System.out.println("aaaaaa"); // case式は定数式でなければいけません
            break;
        case 2:
            System.out.println("bbbbbb");// case式は定数式でなければいけません
            break;
        default:
            System.out.println("Default");
        }
    }
}
