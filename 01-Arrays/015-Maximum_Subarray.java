// Approach:
//  Use Kadane's Algorithm to find the maximum sum of a contiguous subarray.
//  Maintain a running sum and reset it whenever the current element alone is larger.
//  Keep track of the maximum sum encountered during the traversal.
// Complexity
//   Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
                sum=sum+nums[i];
                if(sum<nums[i]){
                    sum=nums[i];
                }
                if(sum>max){
                    max=sum;
                }
               
                   
                        
                    
                }
        
        return max;
    }
}
