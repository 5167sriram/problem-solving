/*
Problem: Min Max in Array
Platform: GeeksforGeeks

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> res=new ArrayList<>();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        res.add(min);
        res.add(max);
        return res;
    }
}



