import java.util.*;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();  // Number of terms
        int m = ip.nextInt();  // Multiplier
        ip.close();

        for (int i = 1; i <= n; i++) {
            int ans = i * m;
            System.out.printf("%d * %d = %d\n", i, m, ans);
        }
    }
}


