class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int num[]:nums1){
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
        for(int num[]:nums2){
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
        int arr[][]=new int[map.size()][2];
        int i=0;
        for(int a:map.keySet()){
            arr[i][0]=a;
            arr[i][1]=map.get(a);
            i++;

        }
        return arr;
        
    }
}