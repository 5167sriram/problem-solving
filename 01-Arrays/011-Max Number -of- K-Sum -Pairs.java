/*
Approach:
1. Sort the array in ascending order.
2. Use two pointers:
   - 'low' starts from the beginning.
   - 'high' starts from the end.
3. Calculate the sum of nums[low] and nums[high].
   - If the sum equals k, a valid pair is found.
     Increment the count and move both pointers.
   - If the sum is less than k, move 'low' to increase the sum.
   - If the sum is greater than k, move 'high' to decrease the sum.
4. Continue until the two pointers meet.

Time Complexity: O(n log n)
- Sorting takes O(n log n).
- The two-pointer traversal takes O(n).

Space Complexity: O(1)
- Uses only constant extra space (excluding the sorting algorithm's internal space).

Key Concepts:
- Sorting
- Two Pointers
- Greedy Pair Matching
*/
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int result=0;
        while(low<high){
            if((nums[low]+nums[high])==k){
                result++;
                low++;
                high--;
            }
            else if((nums[low]+nums[high])>k){
                high--;
            }
            else
            low++;
        }
        
        return result;
    }
}
