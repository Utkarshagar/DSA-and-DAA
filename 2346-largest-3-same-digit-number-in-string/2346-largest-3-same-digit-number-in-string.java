class Solution {
    public String largestGoodInteger(String num) {
        // int a=Integer.MIN_VALUE;
        HashSet<String>arr=new HashSet<>();
        for(int i=0;i<=num.length()-3;i++){
            String b=num.substring(i,i+3);
            if(b.charAt(0)==b.charAt(1) && b.charAt(1)==b.charAt(2) && b.charAt(2)==b.charAt(0)){
               arr.add(b);


            }
            


        }
        int z=0;
        if(arr.size()>1){
            for(String a:arr){
                int r=Integer.parseInt(a);
                z=Math.max(r,z);

            }
            return Integer.toString(z);
        }
        // if(arr.size()==0) 
        if(arr.size()==1) return new ArrayList<>(arr).get(0);
        return "";
       
        
    }
}