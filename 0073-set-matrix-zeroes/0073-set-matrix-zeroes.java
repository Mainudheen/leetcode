class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        for(List<Integer> pair:list){
            int row = pair.get(0);
            int col = pair.get(1);
            transform(matrix,row,col);
        }
    }
    public static void transform(int[][] matrix,int row,int col){
       for(int i=0;i<matrix[0].length;i++){
            matrix[row][i] = 0; 
       }
       for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
       }
    }
}