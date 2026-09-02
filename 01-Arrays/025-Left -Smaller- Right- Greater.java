// Approach:
// Use Prefix Maximum + Suffix Minimum.
// 1. Create mins[] where mins[i] stores the minimum element from i to the end.
// 2. Traverse from left to right while maintaining the maximum element seen so far.
// 3. For each element, check if it is greater than all elements on its left
//    and smaller than all elements on its right.
// 4. Return the element if both conditions are satisfied; otherwise return -1.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int findElement(int[] arr) {
        // code here
       
        int max=arr[0];
        int mins[]=new int[arr.length];
        int min=arr[arr.length-1];
        for(int i=arr.length-1;i>-1;i--){
            if(arr[i]<min){
                min=arr[i];
            }
            mins[i]=min;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(max<arr[i]){
                max=arr[i];
                if(arr[i]<mins[i+1]){
                    return arr[i];
                }
            }
           
        }
        return -1;
    }
}
