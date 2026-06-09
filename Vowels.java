
import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = new String(str);
        String v = "aeiou";
        String V = "AEIOU";
        for(int i = 0;i<s.length();i++) {
            for (int j = 0; j < v.length(); j++) {
                if(s.contains(v.charAt(j)+"") || s.contains(V.charAt(j)+"") ) {
                    str = str.replace(v.charAt(j)+"", "");
                    str = str.replace(V.charAt(j)+"", "");
                }
            }
        }
        System.out.println(str);
    }    
}
