class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums1){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for(int a:nums2){
            // if(map.get(a)==0) map.remove(a);
            if(map.containsKey(a)){
                

                arr.add(a);
                map.put(a,map.get(a)-1);
                if(map.get(a)==0) map.remove(a);
            }

        }
        int arr1[]=new int[arr.size()];
        int i=0;
        for(int y:arr){
            arr1[i]=y;
            i++;
        }
        return arr1;
    }
}