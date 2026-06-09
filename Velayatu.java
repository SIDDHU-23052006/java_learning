import java.util.*;


public class Velayatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<String> arr = new ArrayList<>();
        // arr.add(sc.next());
        // int temp = 0;
        // char ch = 0;
        // for (String str : arr) {
        //     for (int i = 0; i < str.length(); i++) {
        //         int t = 0;
        //         for (int j = 0; j < str.length(); j++) {
        //             if(str.charAt(i) == str.charAt(j)) {
        //                 t++;
        //             }
        //         }
        //         if(temp < t) {
        //             temp = t;
        //             ch = str.charAt(i);
        //         }
        //     }
        // }
        // System.out.println(ch);
        HashMap<Character,Integer> list = new HashMap<>();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {

            if(list.containsKey(str.charAt(i))){
                list.put(str.charAt(i), list.get(str.charAt(i))+1);
            }
            else{
            list.put(str.charAt(i),1);
            }
        }
        int c = 0;
        char ch = 0;
        for (int i = 1; i < str.length(); i++) {
            
            if(list.get(str.charAt(i)) > c) {
                c = list.get(str.charAt(i));
                ch = str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
