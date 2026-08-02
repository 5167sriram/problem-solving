// LeetCode 283 - Move Zeroes
// Approach:
// 1. Traverse the array and move all non-zero elements to the front.
// 2. Keep track of the next position using pointer 'c'.
// 3. Fill the remaining positions with zeros.
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length,c=0;
       for(int i=0;i<l;i++){
        if(nums[i]!=0){
            nums[c]=nums[i];
            c++;
        }
       }for(int i=c;i<l;i++){
            nums[i]=0;
       }
       
        a
    }
}
