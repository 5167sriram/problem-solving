/*
Approach:
1. Create two arrays:
   - leftProduct[i] stores the product of all elements to the left of index i.
   - rightProduct[i] stores the product of all elements to the right of index i.
2. Compute both prefix and suffix products in a single traversal.
3. Multiply the corresponding left and right products to get the final answer.

Time Complexity: O(n)
- One pass to build prefix and suffix products.
- One pass to compute the final result.

Space Complexity: O(n)
- Two auxiliary arrays are used to store prefix and suffix products.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Stores product of all elements to the left
        int leftproduct[] = new int[nums.length];

        // Stores product of all elements to the right
        int rightproduct[] = new int[nums.length];

        int left = 1;
        int right = 1;

        // First element has no left elements
        leftproduct[0] = 1;

        // Last element has no right elements
        rightproduct[nums.length - 1] = 1;

        // Build left and right product arrays together
        for (int i = 1; i < nums.length; i++) {

            left = left * nums[i - 1];
            right = right * nums[nums.length - i];

            leftproduct[i] = left;
            rightproduct[nums.length - 1 - i] = right;
        }

        // Multiply left and right products
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftproduct[i] * rightproduct[i];
        }

        return nums;
    }
}
