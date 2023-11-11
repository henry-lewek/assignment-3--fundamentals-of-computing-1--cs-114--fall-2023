import java.util.Scanner;

public class RunMatrix {
  private static void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
    }

  public static void main(String[] args) {

  //----------------------
  // Asks for + user input
  //----------------------

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the size of the matrix: ");
      int size = scanner.nextInt();

      if (size <= 0) {
          System.out.println("Please enter a positive number.");
          return;
      }


 //----------------------------
 // Reports matrix size to user
 //----------------------------

      System.out.println("The size of your matrix is: " + size + " x " + size);

      int[][] matrix = new int[size][size];

 //------------------------
 // Creates matrix with 0's
 //------------------------

      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            System.out.print("0" + "\t");
        }
        System.out.println();
      }

      int count = 1;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          matrix[i][j] = count;
            count++;
        }
      }

 //----------------------------------
 // Prints each element to the matrix
 //----------------------------------

      System.out.println("Printing matrix...");
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print(matrix[i][j] + "\t");
        }
          System.out.println();
      }

 //-------------------------------------
 // Swaps the matrix except for diagonal
 //-------------------------------------

      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          if (i + j < size - 1) {
            swap(matrix, i, j, size - 1 - j, size - 1 - i);
          }
        }
      }

 //----------------------
 // Prints the new matrix
 //----------------------

      System.out.println("\nPrinting flipped matrix...");
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print(matrix[i][j] + "\t");
        }
          System.out.println();
      }
    }
  }
}
