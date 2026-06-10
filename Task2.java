import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) {
            num *= -1;
        }
        int count = 0;
        while(num > 0) {
            count++;
            num/=10;
        }
        System.out.println(count);
    }
    
}
