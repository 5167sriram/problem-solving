/*

Problem: Binary Search

Platform: GeeksforGeeks

Difficulty: Easy



Approach:

Use Binary Search on the sorted array.

Compare the middle element with the target.

If they are equal, return true.

If the target is smaller, search the left half.

Otherwise, search the right half.

Repeat until the element is found or the search space becomes empty.



Time Complexity: O(log n)



Space Complexity: O(1)

*/
class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return false;
    }
}
