class Solution {

    // Approach:
    // Sort the array and identify gaps between consecutive elements.
    // Add all missing numbers from each gap into the result list.
    //
    // Time Complexity: O(n log n + k)
    //   - O(n log n) for sorting.
    //   - O(k) for adding k missing elements.
    //
    // Space Complexity: O(k)
    //   - Stores the missing elements in the result list.

    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        // Find missing numbers between adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                int diff = nums[i + 1] - nums[i];
                int add = 1;

                // Add all missing numbers in the gap
                while (diff != 1) {
                    result.add(nums[i] + add);
                    add++;
                    diff--;
                }
            }
        }

        return result;
    }
}
