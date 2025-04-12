class Solution {
    public int mySqrt(int x) {
        // ArrayList<Integer>arr=new ArrayList<>();
        // for(int i=1;i<x;i++){
        //     arr.add(i);

        // }
        int a=1;
        int b=x;
        int m=0;
        while(a<=b){
            m=a+(b-a)/2;
            if((long)m*m==x) return m;
            else if((long)m*m>x) b=m-1;
            else{
                a=m+1;
            }

        }
        return b;
        
    }
}