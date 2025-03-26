class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer>ls=new ArrayList<>();
        for(int arr[]:grid){
            for(int i=0;i<arr.length;i++){
                ls.add(arr[i]);
            }
        }
        Collections.sort(ls);
        for(int y:ls){
            if((y-ls.get(0))%x!=0) return -1;
        }
        int mid=(ls.size()-1)/2;
        int a=ls.get(mid);
        int count=0;
        for(int i=0;i<ls.size();i++){
            count+=Math.abs(ls.get(i)-ls.get(mid))/x;
            
        }
        return count;
        
    }
}