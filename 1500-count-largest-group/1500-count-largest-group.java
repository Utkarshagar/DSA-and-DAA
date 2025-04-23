class Solution {
    public int countLargestGroup(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        for(int a=1;a<=n;a++){
           arr.add(print(a,0));
        }
            
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int r:arr){
            map.put(r,map.getOrDefault(r,0)+1);
        }
        int c=0,m=0;
        for(int a:map.keySet()){
            if(map.get(a)>m){
                m=map.get(a);
                c=1;
            }
            else if(map.get(a)==m){
                c++;

            }
            
        }
        return c;
       
        

        
        
    }
    public static int print(int a,int sum){
        while(a!=0){
                sum+=a%10;
                a=a/10;
            }
            return sum;
        }

    
}