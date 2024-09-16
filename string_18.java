import java.util.*;

public class string_18 {

    public static String swap(String s){
       
        char[] charArray = s.toCharArray();

        
         
    char temp = charArray[0];
    charArray[0] = charArray[charArray.length - 1];
         charArray[charArray.length - 1] = temp;

        
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
