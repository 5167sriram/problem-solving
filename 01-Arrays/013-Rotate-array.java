/*
Approach:
1. Find the effective rotation using d % n.
2. Create a temporary array to store the rotated elements.
3. Start placing elements from index (n - d).
4. When the index reaches the end of the array, wrap it back to 0.
5. Copy the rotated array back to the original array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void rotateArr(int[] arr, int d) {

        int n = arr.length;
        d = d % n;

        int[] rotated = new int[n];

        // Starting position 
        int index = n - d;

        for (int i = 0; i < n; i++) {

            // go to  fill the beginning when the end is reached
            if (index == n) {
                index = 0;
            }

            rotated[index] = arr[i];
            index++;
        }

        // Copy rotated elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = rotated[i];
        }
    }
}
