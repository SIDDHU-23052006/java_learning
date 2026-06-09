import java.util.*;

public class Unique4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 4, 1, 6, 7, 8};
        for(int i = 1;i<=arr.length - 1;i++) {
            System.out.print((arr[i] + arr[i - 1])+" ");
        }
    }
}
