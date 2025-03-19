class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=1;i<=arr.length+k;i++){
            boolean x=false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    x=true;
                }
            
            }
            if(x==false){
                ls.add(i);
            }
        }
        return ls.get(k-1);

        
    }
}