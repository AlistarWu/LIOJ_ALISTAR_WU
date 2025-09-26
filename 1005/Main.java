import java.util.Scanner;

public class Main {


    public static int sumOfDivisors(int n) {
        int sum = 1;
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            if (num < 2 || num > 100000) {
                System.out.println("QQ");
                continue;
            }

            int sum = sumOfDivisors(num);

            if (sum > 1 && sum != num && sumOfDivisors(sum) == num) {
                System.out.println(sum);
            } else {
                System.out.println("QQ");
            }
        }

        sc.close();
    }
}
