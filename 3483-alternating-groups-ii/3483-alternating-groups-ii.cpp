#include <vector>
#include <algorithm>

class Solution {
public:
    int numberOfAlternatingGroups(std::vector<int>& colors, int groupSize) {
        int count = 0;
        int start = 0;
        int end = 1;
        int length = colors.size();
        
        while (end < length + groupSize && start < length) {
            int tempEnd = end;
            int tempIndex = tempEnd % length;
            
            while (colors[tempIndex] != colors[(tempIndex - 1 + length) % length] && (tempEnd < length + groupSize - 1)) {
                tempEnd += 1;
                tempIndex = tempEnd % length;
            }
            
            count += std::max(tempEnd - start - groupSize + 1, 0);
            start = tempEnd;
            end = start + 1;
        }
        
        return count;
    }
};
