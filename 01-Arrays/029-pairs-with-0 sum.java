  
        // Approach:
        // 1. Sort the array.
        // 2. Use two pointers: l at the start and h at the end.
        // 3. If arr[l] + arr[h] == 0, add the pair and skip duplicates.
        // 4. If sum < 0, move l forward to increase the sum.
        // 5. If sum > 0, move h backward to decrease the sum.
        // 6. Continue until l >= h.



     // Time Complexity: O(n log n)
    // Sorting takes O(n log n), and the two-pointer traversal takes O(n).

   // Space Complexity: O(n)
  // O(n) is used for storing the result pairs.
  // Auxiliary space apart from the result is O(1) (ignoring sorting stack space).
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int l=0;
        int h=arr.length-1;
        Arrays.sort(arr);
        while(l<h){
            
            int sum=arr[l]+arr[h];
            if(sum==0){
                ArrayList<Integer> x=new ArrayList<>();
                x.add(arr[l]);
                x.add(arr[h]);
                result.add(x);
                int lx=l;
                int hx=h;
                while(arr[lx]==arr[l] && l<arr.length-1){
                    l++;
                }
                while(arr[h]==arr[hx] && h>0){
                    h--;
                }
            }
            else if(sum<0)
            l++;
            else h--;
        }
        return result;
    }
}
