import java.util.*;

public class string_18 {

    public static String swap(String s){
        char[] charArray = s.toCharArray();

        // Swap the first and last characters
        char temp = charArray[0];
        charArray[0] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = temp;

        // Convert the character array back to a string and return
        return new String(charArray);
    }
    public static void main(String[] args) {
        System.out.println("enter the string:  ");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine() ;
        String s7=swap(s);
        System.out.println(s7);
    }
}
