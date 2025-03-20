class Solution {
    public void sortColors(int[] nums) {
        // Hashmap<Integer,Integer>map=new HashMap<>();
        int z=0;
        int o=0;
        int t=0;
        for(int a:nums){
            if(a==0){
                z++;

            }
            if(a==1){
                o++;
            }
            if(a==2){
                t++;
            }
        }
        for(int i=0;i<z;i++){
            nums[i]=0;
        }
        for(int i=z;i<o+z;i++){
            nums[i]=1;
        }
        for(int i=o+z;i<t+o+z;i++){
            nums[i]=2;
        }
        

        
    }
}