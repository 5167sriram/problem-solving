/*
Approach:
- Traverse the array from right to left.
- Keep track of the maximum element seen so far.
- Replace the current element with the maximum.
- Update the maximum using the original value.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=0;i<arr.length;i++){
            int t=arr[arr.length-i-1];
            arr[arr.length-i-1]=max;
            if(max<t){
                max=t;
            }
        }
        return arr;
    }
}
