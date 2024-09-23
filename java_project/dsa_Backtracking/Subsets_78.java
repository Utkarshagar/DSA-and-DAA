package java_project.dsa_Backtracking;

import java.util.ArrayList;

public class Subsets_78 {
    public static void main(String[] args) {

        int num[]={1,2,3};
        print(num,0,new ArrayList<Integer>());
    }
    private static void print(int[]num,int lp,ArrayList<Integer> list){
       System.out.println(list);
        for(int i=lp;i<num.length;i++){
           if(i!=lp && num[i]==num[i-1] ){
               continue;

            }
            list.add(num[i]);
            print(num, i+1, list);
            list.remove(list.size()-1);
        }
    }
    
}
