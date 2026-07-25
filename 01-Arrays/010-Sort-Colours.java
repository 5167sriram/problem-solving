/*
Problem: Sort Colors (LeetCode 75)

Approach:
- Use the Dutch National Flag Algorithm to sort the array in a single traversal.
- Maintain three pointers:
    low  -> Position where the next 0 should be placed.
    mid  -> Current element being processed.
    high -> Position where the next 2 should be placed.
- Traverse the array until mid crosses high.

Algorithm:
1. If the current element is 0:
   - Swap it with the element at low.
   - Increment both low and mid.
2. If the current element is 1:
   - It is already in the correct position.
   - Increment mid.
3. If the current element is 2:
   - Swap it with the element at high.
   - Decrement high.
   - Do NOT increment mid because the swapped element from the right
     has not been processed yet.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        while(mid<=high){
             if(nums[mid]==0){
                int temp=nums[low];
               nums[low]=nums[mid];
               nums[mid]=temp;
                low++;
                mid++;
             }
             else if(nums[mid]==1){
                mid++;
             }
             else{
                int temp=nums[high];
               nums[high]=nums[mid];
               nums[mid]=temp;
                high--;
             }
        }
    }
}
