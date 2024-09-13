import java.util.*;

public class string_4 {

     public static void check(String s){
        int letter=0,up=0,lo=0,dig=0,word=0,sp=0,vo=0;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){  
            letter++;
            if("AEIOUaeiou".indexOf(ch)!=-1)vo++;
            if(Character.isUpperCase(ch))
            up++;
            if(Character.isLowerCase(ch))
            lo++;
            }
            if(Character.isDigit(ch))dig++;
            if(ch == ' ') word++;
            if(!Character.isLetterOrDigit(ch))sp++;
        }
        System.out.println("alphabate: "+ letter + "\nvowel: "+vo+"\nuppercase: "+up+"\nlowercase: "+lo+"\nword: "+(word+1)+"\ndigit: "+dig+"\nspecial char: "+sp);

     }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        check(s);
        
    }
    
}
