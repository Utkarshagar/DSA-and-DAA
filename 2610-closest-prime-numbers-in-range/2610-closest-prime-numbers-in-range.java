import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (i < 2) continue;

            int count = 0; 

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break; 
                }
            }

            if (count == 0) { 
                arr.add(i);
            }
        }

        if (arr.size() < 2) return new int[]{-1, -1};

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = arr.get(i - 1);
                result[1] = arr.get(i);
            }
        }

        return result;
    }
}
