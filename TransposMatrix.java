import java.util.Scanner;

class TransposMatrix {
    public static void main(String args[]) {
        int row, col, i, j, temp, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rows");
        row = sc.nextInt();

        System.out.println("Enter the number of Columns");
        col = sc.nextInt();
        if (row > col)
            n = row;
        else
            n = col;
        int mat1[][] = new int[n][n];

        System.out.println("Enter the elements of Matrix");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++)
                mat1[i][j] = sc.nextInt();

        }

        System.out.println("\n\nOriginal   Matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++)
                System.out.print(mat1[i][j] + " ");

            System.out.println();
        }

        for (i = 0; i < n; i++)
            for (j = i + 1; j < n; j++) {
                temp = mat1[i][j];
                mat1[i][j] = mat1[j][i];
                mat1[j][i] = temp;

            }

        System.out.println("Transpose  of a Matrix:");
        for (i = 0; i < col; i++) {
            for (j = 0; j < row; j++)
                System.out.print(mat1[i][j] + " ");

            System.out.println();
        }

    }
}