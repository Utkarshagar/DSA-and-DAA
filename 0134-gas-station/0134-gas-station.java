class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_sum=0;
        int cost_sum=0;
        for(int a:gas) {
            gas_sum+=a;
        }
        for(int b:cost){
            cost_sum+=b;
        }
        int result=0;
         int curr=0;
        if(gas_sum<cost_sum) return -1;
        for(int i=0;i<gas.length;i++){
           
            
                curr+=gas[i]-cost[i];
            
            if(curr<0){
                result=i+1;
                curr=0;
            }
        }
        return result;
        
    }
}