class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int j=i;j<i+3;j++){
                arr.add(nums[j]);

            }
            System.out.println(arr);
            int a=arr.get(0)+arr.get(2);
            if(a*2==arr.get(1)) count++;
        }
        return count;
        
    }
}