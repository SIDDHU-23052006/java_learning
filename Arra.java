import java.util.*;

public class Arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3,3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        boolean flag = false;
        while(i < j) {
            if(arr[i] == arr[j]) {
                i++;
                j--;
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println(flag);
        else System.out.println(flag);
    }
}