package jp.co.jjs.java_seminar.exercise_20140515_3;

import java.util.HashMap;

public class HashMapExernple {

    public static void main(String[] args) {
        
        HashMap<String, Integer> hash = new HashMap<>();
        
        hash.put("abc", 10);
        hash.put("def", 100);
        hash.put("ghi", 1000);
        
        System.out.println("key 一覧：" + hash.keySet());
        System.out.println("value 一覧" + hash.values());
        System.out.println("指定したkey\"def\":" + hash.get("def"));
        System.out.println("一覧：" + hash);
    }
}
