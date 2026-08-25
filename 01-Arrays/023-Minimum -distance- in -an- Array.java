/*
Approach:
- Traverse the array once.
- Keep track of the latest indices of x and y.
- Whenever both are found, calculate their index difference.
- Keep updating the minimum distance.
- Return -1 if x or y is not present.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int xi=-1;
        int yi=-1;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                xi=i;
            }
            else if(y==arr[i]){
                yi=i;
            }
            if(xi>-1 && yi>-1){
                int maxi=Math.max(xi,yi);
                int mini=Math.min(xi,yi);
                int tempd=maxi-mini;
                if(tempd<result){
                    result=tempd;
                  
                }
            }
        }
        if(xi==-1 || yi==-1) return -1;
        else return result;
    }
}
