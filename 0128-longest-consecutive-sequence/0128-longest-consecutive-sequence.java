class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int a=0;
        int count=0;
        int curr=0;
        for(int n:numSet){
            if(!numSet.contains(n-1)){
                curr=n;
                a=1;
            
            while(numSet.contains(curr+1)){
                curr+=1;
                a=a+1;
            }
            count=Math.max(count,a);

            }
        }
        return count;
    }

        
}