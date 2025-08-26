class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       double d=0;
        int area=0;
        for(int arr[]:dimensions){
            int a=arr[0];
            int b=arr[1];
            double c=Math.sqrt((a*a)+(b*b));
            System.out.println(c);
            if(c>d){
                area=a*b;
                d=c;
            }
             else if(d==c){
                area=Math.max(area,a*b);

             }
        }
        return area;
        
    }
}