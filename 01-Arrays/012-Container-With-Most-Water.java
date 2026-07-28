/*
Approach:
1. Use two pointers, one at the beginning and one at the end of the array.
2. Calculate the water stored using:
      Area = min(arr[left], arr[right]) * (right - left)
3. Update the maximum area found so far.
4. Move the pointer pointing to the shorter building inward,
   since moving the taller one cannot increase the area.
5. Continue until both pointers meet.

Time Complexity:
O(n)
- Each pointer moves at most 'n' times, so the array is traversed only once.

Space Complexity:
O(1)
- Only a few extra variables are used, regardless of the input size.
*/
class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l=0;
        int h=arr.length-1;
        int max=0;
        while(l<h){
            int height=(arr[l]<arr[h])?arr[l]:arr[h];
            int width=h-l;
            if(max<height*width){
                max=height*width;
            }
            if(arr[l]>arr[h]) h--;
            
            else l++;
        }
        return max;
    }
}
