class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int d=0;
        for(int e:apple){
            d+=e;
        }
        int f=0;
        for(int i=capacity.length-1;i>=0;i--){
            f+=capacity[i];
            if(f>=d) return capacity.length-i;
        }
        return capacity.length;
    }
}