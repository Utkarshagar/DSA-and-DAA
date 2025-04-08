class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            HashSet<Character>set=new HashSet<>();
            if(print(word.charAt(i))){
                for(int j=i;j<n && print(word.charAt(j));j++){
                    set.add(word.charAt(j));
                    if(set.size()==5){
                    count++;
                }

                }
                
            }
        }
        return count;
    }
    public static boolean print(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'|| c=='u'){
            return true;
        }
        return false;
    }
}