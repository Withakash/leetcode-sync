class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rSize = matrix.length;
        int cSize = matrix[0].length;

        for(int i = 0 ; i < rSize ; i++){
            for(int j = 0 ; j < cSize ; j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
