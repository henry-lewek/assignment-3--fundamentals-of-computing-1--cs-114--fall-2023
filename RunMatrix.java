import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {


        // Call inputMatrix to get the matrix size
        int size = Matrix.inputMatrix();

        Matrix myMatrix = new Matrix(size);
        myMatrix.reportMatrix(size);
        myMatrix.printMatrix(size);
        myMatrix.populateMatrix(size);
        myMatrix.printMatrix(size);
        myMatrix.flipMatrix(size);
        System.out.println("\nPrinting flipped matrix...\n");

        myMatrix.printMatrix(size);
    }
}
