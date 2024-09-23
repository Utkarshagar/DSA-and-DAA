package java_project.array;

import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(6);
        l1.add(8);
        System.out.println((l1));
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
    
}
