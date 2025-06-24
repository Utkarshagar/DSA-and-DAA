class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> keyIndices = new ArrayList<>();

        // Step 1: Collect all indices where nums[i] == key
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        // Step 2: For each index, check if it's within distance k of any key index
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < keyIndices.size(); j++) {
                if (Math.abs(i - keyIndices.get(j)) <= k) {
                    result.add(i);
                    break; // No need to check further key indices
                }
            }
        }

        return result;
    }
}
