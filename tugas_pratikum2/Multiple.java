package tugas_pratikum2;

class Multiple {
    public static int[][] multiple(int[][] first, int[][] second) {
        int row = first.length, column = first[0].length;
        int[][] multiple = new int[row][column];

        System.out.println("\nSum of Matrices:\n");
        for (int r = 0; r < row; r++)
            for (int c = 0; c < column; c++)
                multiple[r][c] = first[r][c] * second[r][c];

        Print2dArray.print2dArray(multiple);
        return multiple;
    }
}