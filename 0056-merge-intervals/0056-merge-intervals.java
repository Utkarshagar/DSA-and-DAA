class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
    ArrayList<int[]>l=new ArrayList<>();
    for(int a[]:intervals){
        if(l.isEmpty()|| l.get(l.size()-1)[1]<a[0]){
            l.add(a);

        }
        else{
            l.get(l.size()-1)[1]=Math.max( l.get(l.size()-1)[1],a[1]);

        }
        
    }
    return l.toArray(new int[l.size()][]);
    }
}