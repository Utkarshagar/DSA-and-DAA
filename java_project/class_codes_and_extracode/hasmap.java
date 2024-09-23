package java_project.class_codes_and_extracode;

import java.util.HashMap;
import java.util.HashSet;

public class hasmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("tata",95);
        map.put("tesla", 89);
        map.put(null, 56);
        System.out.println(map.get("tata"));
        System.out.println(map.containsKey("tata"));
        for(String key:map.keySet()){
            System.out.println("ket:->"+key+" Value:->"+map.get(key));
            System.out.println(map.get(key));
        }
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        System.out.println();

    }
    
}
