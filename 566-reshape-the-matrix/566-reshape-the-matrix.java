class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[] storage = new int[r * c];
        int[][] reshape = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                storage[mat[0].length * i + j] = mat[i][j];
            }
        }
        for (int i = 0; i < storage.length; i++) {
            reshape[i / c][i % c] = storage[i];
        }

        return reshape;
    }
}
