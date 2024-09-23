import java.util.*;
public class pract2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("petrol",50);
        map.put("disel",60);
        map.put("kerosine",20);
        System.out.println(map);
        if(map.containsKey("petrol")){
            System.out.println("key is present");
        }
        else{
            System.out.println("Not present");
        }
        System.out.println(map.get("petrol"));//key exist

        System.out.println(map.get("liquid"));
        

    }
    
}
