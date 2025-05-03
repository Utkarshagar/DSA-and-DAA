class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int a=events[0][0];
        int b=events[0][1];
        if(events.length==1) return a;
        for(int i=1;i<events.length;i++){
            int duration=events[i][1]-events[i-1][1];
            
                if(duration>b){
                   b=duration;
                    a=events[i][0];
                    
                }
            else if(b==duration){
                a=Math.min(a,events[i][0]);
                    
            }
                
            
        }
       
        return a;
        
        
    }
}