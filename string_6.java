import java.io.IOException;
import java.util.*;
/**
 * string_6
 */
public class string_6 {
    
    public static void Short_name(String s)
    {
        int k = s.indexOf(' ');
        String s1 = s.substring(0, k);
        String s2 = s.substring(k+1);
        String Short_n=Character.toUpperCase(s1.charAt(0))+". "+s2;
        System.out.println(Short_n);


    }
    

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        Short_name(s);
    }
}