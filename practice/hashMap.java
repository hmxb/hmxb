package sample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(111, "one");
        hashMap.put(222, "two");
        hashMap.put(333, "three");

        // 값을 취득
        String value = hashMap.get(333);
        System.out.println("value: " + value);

        // 삭제
        value = hashMap.remove(222);
        System.out.println("삭제된 값 : " + value);

        // 검색
        boolean b = hashMap.containsKey(new Integer(333));
        System.out.println(b);
        
        if(b==true) {
            String v = hashMap.get(333);
            System.out.println("v: " + v);
        }

        // 수정
        hashMap.put(222, "200 + 20 + 2");

        // 값을 모두 출력
        // Iterator : 반복자(주소), key값
        Iterator<Integer> it = hashMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String val = hashMap.get(key);
            System.out.println("key : " + key + " value : " + val);
        }
        
        Map<String, String> hMap = new HashMap<String, String>();

        hMap.put("apple", "사과");
        hMap.put("banana", "바나나");
        hMap.put("melon", "멜론");
        hMap.put("mango", "망고");

        // String value1 = hMap.get("바나나");
        // System.out.println("value1: " + value1);

        // value1 = hMap.remove("바나나");
        // System.out.println("삭제된 값 : " + value1);

        // boolean b1 = hMap.containsKey(new String("망고"));
        // System.out.println("b1");

        // if(b1==true) {
        //     String v1 = hMap.get("망고");
        //     System.out.println("v1: " + v1);
        // }

        Iterator<String> it1 = hMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            String val = hMap.get(key);
            System.out.println("key : " + key + " value : " + val);
        }
        System.out.println("=======================");
        // HashMap > TreeMap
        Map<String, String> tMap = new TreeMap<String, String>(hMap);
        
        // Sorting
        // 오름차순
        // Iterator<String> it2 = tMap.keySet().iterator();
        // 내림차순
        Iterator<String> it2 = ((TreeMap<String, String>) tMap).descendingKeySet().iterator();
        while(it2.hasNext()){
            String key = it2.next();
            String val = tMap.get(key);
            System.out.println("key : " + key + " value : " + val);
        }

        Map<String, Object> userMap = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();

        userMap.put("info", "Hello World!");
        userMap.put("counting", new Integer(1024));
        userMap.put("list", list);
    }
}