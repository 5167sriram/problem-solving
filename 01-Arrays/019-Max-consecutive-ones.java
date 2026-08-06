//  Find Max Consecutive Ones

//  Approach
// - Traverse the array only once.
// - Keep track of the current streak of consecutive `1`s.
// - When a `0` is encountered, compare the current streak with the maximum streak found so far and reset the current count.
// - After the traversal, perform one final comparison to handle arrays ending with `1`s.

//  Time Complexity
// - **O(n)** – Each element is visited exactly once.

//  Space Complexity
// - **O(1)** – Uses only constant extra space.

// Key Learning
// - A single-pass traversal with a running counter is sufficient to solve the problem efficiently.
// - Always check the final streak after the loop, as the array may end with consecutive `1`s.
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       if(nums.length==0) return 0;
        int sum=0;
        int max=0;
        for(int i:nums){
            sum=sum+i;
            if(i==0){
                if(max<sum)
                max=sum;
              sum=0;
            }
        }
        if(max<sum)
        max=sum;
        return max;
    }    
    
}
