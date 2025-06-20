class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer>arr1=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    arr1.add(1);
                }
                else{
                    arr1.add(arr.get(i-2).get(j-1)+arr.get(i-2).get(j));
                }

            }
            arr.add(arr1);
        }
        return arr;
    }
}