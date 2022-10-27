import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][n - i - 1] = 1;
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
