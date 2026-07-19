/*
 * Problem: Second Largest Element
 * Platform: GeeksforGeeks
 *
 * Approach:
 * - Traverse the array once.
 * - Keep track of the largest and second largest elements.
 * - Update them whenever a larger element is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1=arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max1==arr[i])
            continue;
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
                
            }
            else{
                if(max2<arr[i]){
                    max2=arr[i];
                }
            }
        }
        if(max2==Integer.MIN_VALUE)
        max2=-1;
        return max2;
    }
}
