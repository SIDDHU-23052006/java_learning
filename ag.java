import java.util.*;

public class ag {

    static int Su(int s, int[] arr, int i) {
        if (i >= arr.length) {
            return s;
        }

        s += arr[i];

        return Su(s, arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Su(0, arr, 0));
    }
}