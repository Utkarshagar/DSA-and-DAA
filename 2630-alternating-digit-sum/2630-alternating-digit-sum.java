class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        while(n!=0){
            int a=n%10;
            arr.add(a);
            n=n/10;
        }
        int i=1;
        int sum=0;
        for(int j=arr.size()-1;j>=0;j--){
            if(i%2!=0){
                sum+=arr.get(j);

            }
            else{
                sum-=arr.get(j);
            }
            i++;

        }
        return sum;
    }
}