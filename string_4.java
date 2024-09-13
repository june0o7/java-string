<<<<<<< HEAD
import java.util.Scanner;

public class string_4 {

     public static void check(String s){
        int letter=0,up=0,lo=0,dig=0;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){  
            letter++;
            if(Character.isUpperCase(ch))
            up++;
            if(Character.isLowerCase(ch))
            lo++;
            }
            if(Character.isDigit(ch))dig++;


          

        }

     }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        check(s);
        
    }
    
}
=======
import java.util.Scanner;

public class string_4 {

     public static void check(String s){
        int letter=0,up=0,lo=0,dig=0;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){  
            letter++;
            if(Character.isUpperCase(ch))
            up++;
            if(Character.isLowerCase(ch))
            lo++;
            }
            if(Character.isDigit(ch))dig++;


          

        }

     }



     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        check(s);
        
    }
    
}
>>>>>>> 0c9ce6c6c091f76f3856d98f64248a270c475b79
