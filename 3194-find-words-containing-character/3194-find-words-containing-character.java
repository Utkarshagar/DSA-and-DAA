class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     ArrayList<Integer>arr=new ArrayList<>();
     for(int i=0;i<words.length;i++){
        String a=Character.toString(x);
        if(words[i].contains(a)){
            arr.add(i);

        }
     }
     return arr;
    }
}