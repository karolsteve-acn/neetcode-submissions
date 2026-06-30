class Solution {
    public void setZeroes(int[][] matrix) {
        int[] rowsToClear = new int[matrix.length];
        int[] colsToClear = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    rowsToClear[i] = 1;
                    colsToClear[j] = 1;
                }
            }
        }

        for(int i = 0; i < rowsToClear.length; i++) {
            if(rowsToClear[i] == 1) {
                for(int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < colsToClear.length; j++) {
            if(colsToClear[j] == 1) {
                for(int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
