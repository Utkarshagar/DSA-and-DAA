package java_project.class_codes_and_extracode;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        combinationSumHelper(candidates, target, 0, currentList, result);
        return result;
    }
     private static void combinationSumHelper(int[] arr, int target, int startIndex, List<Integer> currentList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = startIndex; i < arr.length; i++) {
            if (target >= arr[i]) {
                currentList.add(arr[i]);
                combinationSumHelper(arr, target - arr[i], i, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
    
}
