class Solution {
    public String compressedString(String word) {
        StringBuilder c = new StringBuilder();
        int cnt = 1, n = word.length();
        char ch = word.charAt(0);
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == ch && cnt < 9) {
                cnt++;
            } else {
                c.append(cnt).append(ch);
                ch = word.charAt(i);
                cnt = 1;
            }
        }
        c.append(cnt).append(ch);
        return c.toString();
    }
}