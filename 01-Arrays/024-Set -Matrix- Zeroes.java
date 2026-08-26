/*
         * Approach:
         * 1. Traverse the matrix and find cells containing 0.
         * 2. Store all columns containing original zeros in a HashSet.
         * 3. When a zero is found, make the entire row zero.
         *    Before changing the row, record any other original zero
         *    columns found in that row.
         * 4. After processing all rows, make every stored column zero.
         *
         * HashSet is used to avoid storing duplicate column indices.
         */
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        HashSet<Integer> zc=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zc.add(j);
                
                int low=0;
                int high=n-1;
                while(low<=high){
                    if(matrix[i][low]==0){
                        zc.add(low);
                        
                    }
                    if(matrix[i][high]==0 && high!=low){
                        zc.add(high);
                      
                    }
                    matrix[i][low]=0;
                    matrix[i][high]=0;
                    low++;
                    high--;
                    
                }
                break;
                }
            }
        }
        for(Integer c:zc){
            for(int i=0;i<m;i++){
                 matrix[i][c]=0;
            }
        }
           
        

        
    }
}
