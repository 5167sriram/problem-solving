/* Approach: - Use binary search twice because the array may contain duplicate elements. 
- First binary search finds the first occurrence by continuing the search towards the left. 
- Second binary search finds the last occurrence by continuing the search towards the right.
- If the target is not present, both positions remain -1. 
Time Complexity: O(log n) Space Complexity: O(1)
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=-1;
        result[1]=-1;
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
           int mid=(low+high)/2;
           if(nums[mid]<target) low=mid+1;
           else if(nums[mid]>target)   high=mid-1;

           else{
           
            result[0]=mid;
            high=mid-1;
            
          }
      }
      low=0;
      high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
            else{
               result[1]=mid;
               low=mid+1;
            }
        }
        return result;
    }
}
