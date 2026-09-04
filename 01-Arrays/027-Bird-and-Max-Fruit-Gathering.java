/*
Approach:
- Use a sliding window of size m.
- Since the array is circular, use modulo (%) to wrap around.
- Maintain the sum of fruits in the current window.
- After reaching window size m, update the maximum and remove
  the leftmost element before moving to the next window.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int maxfruit=0;
        int fruit=0;
        int l=0;
        int i=-1;
        int v=0;
        while(i<arr.size()+m-2){
            int index=(i+1)%arr.size();
            v++;
            fruit=fruit+arr.get(index);
            if(v==m){
                if(fruit>maxfruit){
                    maxfruit=fruit;
                }
                fruit=fruit-arr.get(l++);
                v--;
            }
            i++;
        }
        return maxfruit;
    }
}
