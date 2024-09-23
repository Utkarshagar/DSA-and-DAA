package java_project.hash_Map;

import java.util.HashMap;

public class lec2 {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        String str="aaaaa";
        for(char c:str.toCharArray()){
            map.put(String .valueOf(c),map.getOrDefault(String.valueOf(c),0)+1);
            
        }
        System.out.println(map);
    }
    
}
