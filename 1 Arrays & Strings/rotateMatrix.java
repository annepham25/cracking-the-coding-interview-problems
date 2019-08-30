// NxN matrix, rotate image by 90 degrees
    public static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = 0; i < last; i++) {
                int offset = i - first;
                int top = [first][i];
                // left --> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom --> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right --> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top --> right
                matrix[i][last] = top;
            }
        }
        return true;
    }
