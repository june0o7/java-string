import java.io.IOException;
import java.util.*;

public class string_5 {

     public static void palindrome(String s)
     {
         String s1 = "";
         for(int i = 0 ; i<s.length();i++){
            s1 =s.charAt(i)+ s1  ;

         }
         if (s.equals(s1)) {
            System.out.println("this String is palindrome");
         }else
         System.out.println("this is not palindrome");
     }
     public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        palindrome(s);
        
         
        
    
}
}