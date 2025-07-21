class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sg=0;
        int sc=0;
        for(int a: gas){
            sg+=a;

        }
        for(int b:cost){
            sc+=b;
        }
        if(sg<sc) return -1;
        int r=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                r=i+1;
            }


            
        }
        return r;
        
    }
}