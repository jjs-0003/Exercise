package jp.co.jjs.java_seminar.self_study.q2_3;

public class Exercise2 {

    public static void main(String[] args) {
        
        String str = "121,345,656,767,878";
        String[] str2 = str.split(",");
        
        System.out.println(str2[str2.length-1]);
        
    }
}
