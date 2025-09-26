import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(in.nextLine());
        }

        String S = sb.toString();

        int m = in.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int index = in.nextInt();
            result.append(S.charAt(index - 1));
        }

        System.out.println(result.toString());
    }
}