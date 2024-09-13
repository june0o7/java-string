import java.util.*;
public class string_2{
    
    
    
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            int ch = s.charAt(i);
            System.out.print(" "+ ch );
        }



    }
} 