import java.util.*;

public class string_12 {
    public static void encrypted(String s){
        String s1 ="";
        for (int  i = 0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='y')s1+='a';
            if(ch=='z')s1+='b';
            // ch++;
            // ch++;
            if (ch >= 'a' && ch <= 'x') {
                
                char ch2 =(char) (ch+2);
                s1+=ch2;
            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        encrypted(s);
    }
    
}
