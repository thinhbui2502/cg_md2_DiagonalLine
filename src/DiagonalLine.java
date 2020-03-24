import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        int row, col;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        row = sc.nextInt();
        col = row;
        int[][] matrix = new int[row][col];

        //Nhập dữ liệu cho matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Tính tổng đường chéo
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
                    total += matrix[i][i];
        }
        System.out.println("Sum of the numbers in the main diagonal of the square matrix: " + total);
    }
}
