import java.util.*;

public class string_8 {
    public  static void intocapital(String s){
        String s1 = " ";
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                ch = (char)(ch - 32);
               
            s1+=ch;
    }
    System.out.println(s1); 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        intocapital(s);
    }
}
