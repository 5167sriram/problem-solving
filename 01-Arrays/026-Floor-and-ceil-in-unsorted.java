/*
Approach:
- Traverse the array once.
- For Floor, keep track of the largest element that is <= x.
- For Ceil, keep track of the smallest element that is >= x.
- If no valid Floor or Ceil exists, return -1.

Time Complexity: O(n)
Space Complexity: O(1) auxiliary space
*/class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int[] result=new int[2];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                if(arr[i]<=x) max=arr[i];
            }
            if(min>arr[i]){
                if(arr[i]>=x) min=arr[i];
                
            }
        }
        result[0]=(max==Integer.MIN_VALUE)?-1:max;
        result[1]=(min==Integer.MAX_VALUE)?-1:min;
        return result;
        
    }
}
