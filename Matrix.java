

public class Matrix {
  private int[][] matrix;
  String PURPLE = "\u001B[35m";
  String RESET = "\u001B[37m";
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

public Matrix(int size) {
  matrix = new int[size][size];
}

  // ----------------------
  // Asks for + user input
  // ----------------------
  public static int inputMatrix() {
    int size = 0;
    try {
        System.out.print("Enter the size of the matrix: ");
        size = Integer.parseInt(System.console().readLine());

        if (size <= 0) {
            System.out.println("enter a positive number.");
            return -1; // Return a int value to indicate an error
        }

        return size;
    } catch (NumberFormatException arr) {
        System.out.println("enter a positive number.");
        return -1; // Return a int value to indicate an error
      }
}

  // ----------------------------
  // Reports matrix size to user
  // ----------------------------
  public static void reportMatrix(int size) {
    System.out.println("The size of your matrix is: " + size + " x " + size);


  }

  // ------------------------
  // Creates matrix with 0's
  // ------------------------
  public void printMatrix(int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if(j == size - i - 1) {
          System.out.printf("%s%d%s\t" , PURPLE , matrix[i][j] , RESET);
        }
        else {
          System.out.printf("%d\t" , matrix[i][j]);
        }

      }
      System.out.println();

    }
  }

  // ----------------------------------
  // Prints each element to the matrix
  // ----------------------------------
  public void populateMatrix(int size) {
    int count = 1;
    System.out.println("Printing matrix...");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {

        matrix[i][j] = count;
        count++;
      }
    }

  }

  // -------------------------------------
  // Swaps the matrix except for diagonal
  // -------------------------------------
  public void flipMatrix(int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i + j < size - 1) {
          swap(i, j, size - 1 - i, size - 1 - j);
        }
      }
    }
  }
}
