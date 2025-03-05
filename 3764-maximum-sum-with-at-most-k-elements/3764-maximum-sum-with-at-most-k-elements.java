class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        ArrayList<Integer>ls=new ArrayList<>();
        int n=limits.length;

        for(int j=0;j<n;j++){
            int arr[]=grid[j];
            
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=arr.length-limits[j];i--){
                ls.add(arr[i]);
            }
           

        }
        Collections.sort(ls);
        long s=0;
        if(ls.size()>0){
            for(int i=ls.size()-1;i>=ls.size()-k;i--){
            s+=ls.get(i);

        }

        }
        
        return s;
        
        
    }
}