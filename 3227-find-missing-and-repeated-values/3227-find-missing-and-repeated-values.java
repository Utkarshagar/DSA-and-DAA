class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int x[]=new int[2];
       HashMap<Integer,Integer>map=new HashMap<>();
       int sum=0;
       for(int arr[]:grid){
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            sum+=arr[i];
        }
       }

       for(int a:map.keySet()){
        if(map.get(a)==2){
            x[0]=a;
            sum-=x[0];
        }
       }
       int sum2=0;
       for(int i=1;i<=n*n;i++){
        sum2+=i;

       }
       x[1]=sum2-sum;
       return x;

        
    }
}