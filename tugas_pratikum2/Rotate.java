package tugas_pratikum2;

public class Rotate {
    public static int[][] rotateBack(int[][] transposedMatrix) {
        // Since transposing twice will give back the original matrix
        return Transpose.transpose(transposedMatrix);
    }
}