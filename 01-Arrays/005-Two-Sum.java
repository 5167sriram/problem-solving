/*
Problem: Two Sum

Description:
Given an array of integers and a target value, determine whether there exists a pair of numbers whose sum equals the target.

Approach:
1. Sort the array in ascending order.
2. Initialize two pointers:
   - Left pointer at the beginning.
   - Right pointer at the end.
3. Calculate the sum of the two pointer values.
4. If the sum equals the target, return true.
5. If the sum is greater than the target, move the right pointer left.
6. If the sum is smaller than the target, move the left pointer right.
7. Continue until the pointers meet.

Algorithm Used:
- Sorting
- Two Pointer Technique

Time Complexity: O(n log n)
Space Complexity: O(1) (Ignoring the space used by the sorting algorithm)
*/
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            if(arr[left]+arr[right]==target){
                return true;
            }
            else{
                if(arr[left]+arr[right]>target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return false;
    }
}
