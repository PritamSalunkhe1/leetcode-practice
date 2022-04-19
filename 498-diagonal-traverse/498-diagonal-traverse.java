class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        int d = 1;

        for (int i = 0; i < m*n; i++) {
            result[i]= mat[row][col];
            if((row+col)%2==0){  //Move Up
                if(col==n-1){
                    //reached last column
                    row++;
                }
                else if (row==0){
                    //reached first row
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{   //Move Down
                if(row==m-1){
                    //reached last row.
                    col++;
                }
                else if(col==0){
                    //reached first column
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
            
        }
        return result;
    }
}
