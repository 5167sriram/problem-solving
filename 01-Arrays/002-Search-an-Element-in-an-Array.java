/*
Problem: Search an Element in an Array
Platform: GeeksforGeeks
Difficulty: Easy

Approach:
Traverse the array from left to right.
If the target element is found, return its index.
If the traversal completes without finding the element, return -1.

Time Complexity:
Best Case: O(1)
Worst Case: O(n)

Space Complexity: O(1)
*/
class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
