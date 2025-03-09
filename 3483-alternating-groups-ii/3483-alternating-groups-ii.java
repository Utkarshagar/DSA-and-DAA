import java.util.*;

class Solution {
    public int numberOfAlternatingGroups(int[] colors, int groupSize) {
        int count = 0;
        int start = 0;
        int end = 1;
        int length = colors.length;
        
        while (end < length + groupSize && start < length) {
            int tempEnd = end;
            int tempIndex = tempEnd % length;
            
            while (colors[tempIndex] != colors[(tempIndex - 1 + length) % length] && (tempEnd < length + groupSize - 1)) {
                tempEnd += 1;
                tempIndex = tempEnd % length;
            }
            
            count += Math.max(tempEnd - start - groupSize + 1, 0);
            start = tempEnd;
            end = start + 1;
        }
        
        return count;
    }
}