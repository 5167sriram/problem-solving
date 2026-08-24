class Solution {
    public void segregateElements(int[] arr) {
        // code here
         /*
         * Approach:
         * 1. Use an auxiliary array to maintain the required order.
         * 2. Store non-negative elements from left to right.
         * 3. Store negative elements from right to left.
         * 4. Reverse the negative portion to preserve their original order.
         * 5. Copy the auxiliary array back to the original array.
         *
         * Time Complexity: O(n)
         *   - First loop: O(n)
         *   - Reverse negative elements: O(n)
         *   - Copy result back: O(n)
         *   Overall: O(n)
         *
         * Space Complexity: O(n)
         *   - Auxiliary array of size n is used.
         */
        int low=0;
        int high=arr.length-1;
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr2[low++]=arr[i];
            }
            else arr2[high--]=arr[i];
        } 
        int l=high+1;
        int h=arr.length-1;
        while(l<h){
            int temp=arr2[l];
            arr2[l]=arr2[h];
            arr2[h]=temp;
            l++;
            h--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr2[i];
        }
    }
      
      
      
}
