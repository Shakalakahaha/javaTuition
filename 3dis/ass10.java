import java.util.Scanner;
public class ass10 {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter option: ");
        int option=scan.nextInt();

        try {
            switch (option){
                case 1:
            int[][] matrix = new int[3][4];
                System.out.println("Enter values for a 3x4 matrix:");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                        matrix[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Matrix 3*4 :");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
            int[][] matrix2 = new int[2][3];
                System.out.println("Enter values for a 2x3 matrix:");
                for (int i = 0; i <= matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                        matrix2[i][j] = scan.nextInt();
                    }
                }
                System.out.println("Matrix 2*3 :");
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        System.out.print(matrix2[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid option");
                break;
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
    
    }

}

