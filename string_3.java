import java.util.*;


public class string_3 {
    

    public static void check_first_vowel(String s){
        boolean b = false;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                System.out.println(i);
                b=true;
                break;
            }
        }
        if(!b)
        System.out.println("sorry there is no vowel");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        check_first_vowel(s);
    }
    
}
