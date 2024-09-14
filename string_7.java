import java.util.*;

public class string_7 {
    public static void Short_name(String s)
    {
        int k = s.indexOf(' ');
        int l = s.indexOf(' ', k + 1);
        String s1 = s.substring(0, k);
        String s2 = s.substring(k+1,l);
        String s3 = s.substring(l+1);
        String Short_n=Character.toUpperCase(s1.charAt(0))+"."+Character.toUpperCase(s2.charAt(0))+"."+s3;
        System.out.println(Short_n);


    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        Short_name(s);
    }
    
}
