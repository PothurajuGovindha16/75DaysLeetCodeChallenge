class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int stRow = 0;
        int stCol = m-1;
        while(stRow<=n-1 && stCol>=0){
            int val = matrix[stRow][stCol];
            if(matrix[stRow][stCol] == target){
                return true;
            }else if(matrix[stRow][stCol] > target){
                stCol--;
            }else{
                stRow++;
            }
        }
        return false;
    }
}