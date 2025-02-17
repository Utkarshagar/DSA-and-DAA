import java.util.HashSet;

public class Leetcode1079 {
    class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String>ls=new HashSet<>();
        boolean arr[]=new boolean[tiles.length()];
        String s;
        int index;
        print(tiles,"",0,ls,arr);
        return ls.size();        
    }
    public static void print(String tiles,String s,int index,HashSet<String>ls,boolean arr[]){
        if(!s.isEmpty()){
            ls.add(s);
        }
        for(int i=0;i<tiles.length();i++){
            if(!arr[i]){
                arr[i]=true;
            
            print(tiles,s+tiles.charAt(i),index+1,ls,arr);
            arr[i]=false;
            }

        }
    } 
}
    
}
