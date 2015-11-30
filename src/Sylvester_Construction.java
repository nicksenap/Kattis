import java.util.Scanner;
public class Sylvester_Construction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[][] H = new boolean[N][N];


        H[0][0] = true;
        for (int n = 1; n < N; n += n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    H[i+n][j]   =  H[i][j];
                    H[i][j+n]   =  H[i][j];
                    H[i+n][j+n] = !H[i][j];
                }
            }
        }

        // print matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (H[i][j]) System.out.print("1 ");
                else         System.out.print("-1 ");
            }
            System.out.println(H[10][10]);
        }
    }

}
