/*
Problem: Find All Numbers Disappeared in an Array

Approach:
1. Traverse the array.
2. Use the value to find its corresponding index.
3. Mark that index as visited by making the value negative.
4. Ignore duplicate visits if already negative.
5. Positive indices after traversal represent missing numbers.

Time Complexity: O(n)
Space Complexity: O(1) (excluding the output list)
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int t=Math.abs(nums[i])-1;
            if(nums[t]>0)
            nums[t]=nums[t]*-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
