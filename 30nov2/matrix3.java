import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matrix3 = new String[2][2];

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        // Fill the matrix with the entered number
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = String.valueOf(number);
            }
        }

        // Print the matrix
        System.out.println("The matrix numbers are:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
