/**
 * string_14
 */
import java.util.*;
public class string_14 {
    public static void reverseword(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {//did not underrstand the concept properly//
            sb.append(words[i]).append(" ");
            
            }
            System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        reverseword(s);
    }
}