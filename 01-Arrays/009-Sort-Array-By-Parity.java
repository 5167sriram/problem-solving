/*
Problem: Sort Array By Parity

Approach:
- Use the two-pointer (partitioning) technique.
- Maintain three pointers:
  low  -> Position where the next even number should be placed.
  mid  -> Current element being processed.
  high -> Position where the next odd number should be placed.
- If the current element is even, swap it with 'low' and move both 'low' and 'mid'.
- If the current element is odd, swap it with 'high' and decrement 'high'.
- Continue until all elements are processed.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==0) return nums;
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]%2==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return nums;
    }
}
