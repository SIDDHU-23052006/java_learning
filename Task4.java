import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int high = 0;
        while(num > 0) {
            int temp = num % 10;
            if(high < temp) {
                high = temp;
            }
            num/=10;
        }
        System.out.println(high);
    }
}
