class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length;
    int m = matrix[0].length;
    List<Integer> al = new ArrayList<Integer>();
    int k=0;
    if(matrix[0][0]==target) return true;
    for(int i = 0 ; i < n ; i++ )
    {
        for(int j = 0 ; j < m ; j++)
        {
              al.add(matrix[i][j]);
        }
    }

    int result = Collections.binarySearch(al, target);
       
        if (result <= 0)
            return false;
        else
            return true;
        // System.out.println(result);
        // return true;

    }
}

