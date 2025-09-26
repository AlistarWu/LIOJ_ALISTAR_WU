import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取比賽組數 M
        int M = scanner.nextInt();
        scanner.nextLine(); // 吃掉換行符號

        for (int i = 0; i < M; i++) {
            // 讀取 A, B, K
            String aStr = scanner.next();
            String bStr = scanner.next();
            int K = scanner.nextInt();

            // 將 A 和 B 轉換為 BigInteger
            BigInteger A = new BigInteger(aStr);
            BigInteger B = new BigInteger(bStr);

            int compareResult = A.compareTo(B); // compareTo 的回傳值: -1 (A<B), 0 (A==B), 1 (A>B)

            if (compareResult == 0) {
                System.out.println("DRAW");
            } else if ((K == 1 && compareResult > 0) || (K == -1 && compareResult < 0)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }

        scanner.close();
    }
}