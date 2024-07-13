package tugas_pratikum2;

public class Transpose {
    public static int[][] transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;
        int[][] transposed = new int[column][row];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                transposed[c][r] = data[r][c];
            }
        }
        return transposed;
    }
}
