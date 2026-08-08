/*
Approach:
1. Traverse the array from the last digit to the first.
2. If the current digit is less than 9:
   - Increment it by 1 and return the updated array.
3. If the current digit is 9:
   - Set it to 0 and continue checking the previous digit (carry propagation).
4. If all digits are 9 (e.g., 999):
   - Create a new array of size n+1.
   - Set the first element to 1 (result becomes 1000).

Time Complexity: O(n)
- In the worst case, every digit is visited once.

Space Complexity: O(1)
- No extra space is used except when all digits are 9, where a new array of size n+1 is created.
- Worst-case auxiliary space: O(n).
*/
import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        
     
        int l=digits.length;
        for(int i=0;i<l;i++){
            if(digits[l-i-1]<9){
                digits[l-i-1]++;
                return digits;
            }
            digits[l-i-1]=0;
        }
        int[] arr=new int[l+1];
        arr[0]=1;
        return arr;
        
    }
}
