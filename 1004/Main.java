import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < M; i++) {

            String aStr = scanner.next();
            String bStr = scanner.next();
            int K = scanner.nextInt();


            BigInteger A = new BigInteger(aStr);
            BigInteger B = new BigInteger(bStr);

            int compareResult = A.compareTo(B);

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