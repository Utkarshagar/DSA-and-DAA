class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,maxl=0;
        int n=fruits.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r=0;r<n;r++){
           map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
           while(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);
            if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
            }
            l++;

           }
           maxl=Math.max(maxl,r-l+1);
        }
        return maxl;



        
    }
}