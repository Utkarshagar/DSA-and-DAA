// package java_project.hash_Map;

import java.util.HashMap;

public class lec1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",65);
        map.put("B", 66);
        map.put("c", 67);
        map.put("D", 68);
        map.put("E", 69);
        map.put("null",70);
        System.out.println(map);
        System.out.println(map.containsKey("abc"));
        for(String k:map.keySet()){
            System.out.println(k+":"+map.get(k));
            // System.out.println(k);

        }
    }
    
}
