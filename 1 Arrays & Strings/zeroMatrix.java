// if an element in an MxN matrix is 0, its entire row and column are set to 0
    public static int[][] zeroMatrix(int[][] matrix) {
        boolean[][] hasZero = new boolean[matrix.length][matrix[0].length];
        // checks if there's a 0 element, and makes and identifier
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    hasZero[i][j] = true;
                } else {
                    hasZero[i][j] = false;
                }
            }
        }

        // makes every element in that row and column set to 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (hasZero[i][j]) {
                    int row = i;
                    int column = j;
                    for (int k = 0; k < matrix.length; k++) {
                        for (int l = 0; l < matrix[0].length; l++) {
                            if (row == k) {
                                matrix[k][l] = 0;
                            }
                            if (column == l) {
                                matrix[k][l] = 0;
                            }
                        }
                    }
                }
            }
        }

        return matrix;

    }
