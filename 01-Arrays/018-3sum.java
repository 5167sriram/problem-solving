// Sort the array to apply the two-pointer approach
// Fix one element and search for the other two elements
// Skip duplicate values to avoid duplicate triplets
// Store each valid triplet whose sum is 0
// Time Complexity: O(n²)
// Space Complexity: O(1) (excluding the output list)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
       
        Arrays.sort(nums);
        int prev=0;
        for(int i=0;i<nums.length;i++){
        
             int low=i+1;
              int high=nums.length-1;
              int fix=nums[i];
              if(i>0 && nums[i]==nums[i-1]) continue;
        
        while(low<high){
            
            int target=nums[low]+nums[high];
            target=target*-1;
            if(target==fix){
                List<Integer> x=List.of(nums[low],nums[high],nums[i]);
                
                result.add(x);
               
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1]) {
               low++;
               }
               while (low < high && nums[high] == nums[high + 1]) {
               high--;
               }
              
            }
            else if(nums[low]+nums[high]>-1*fix){
                high--;
            }
            else
            low++;
             
            
            
        }
       
        }
        return result;
    }
}
