import java.util.Scanner;

public class RunMatrix {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

      if (size <= 0) {
        System.out.println("Please enter a positive number.");
          return;

      }
       System.out.println("The size of your matrix is: " + size + " x " + size );
    }
  }
