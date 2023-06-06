import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Reading in array size
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrice = new int[n][m];

        //Reading in matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[i][j] = scan.nextInt();
            }
        }
        //Printing out matrice
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i < m; i++) {
            for (int j = n; j > 0; j--) {
                System.out.printf("%d%d ", j, i);
            }
            System.out.println();
        }*/

        //Transpose matrix
        int[][] transposedMatrice = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrice[j][i] = matrice[i][j];
            }
        }
        //Printing out transposed matrice
        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrice[i][j] + " ");
            }
            System.out.println();
        }*/
        //Reverse lines
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(transposedMatrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
