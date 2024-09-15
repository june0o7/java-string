import java.io.IOException;
import java.util.Scanner;

// In Piglatin a word such as KING becomes INGKAY, TROUBLE becomes
// OUBLETRAY as so on. The first vowel of the original word becomes the starting of
// the translation and proceeding letter being shifted towards the end and followed
// by AY. Word that begins with a vowel is left unchanged. WAP to accept a word
// and convert in to Piglatin word.

public class string_10 {




    public static void piglatin(String s){
        boolean a = false;
       
        String s2 = "";
        String S3 = "ay";
        
        for (int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1 && a==false) {
                s2+=ch;
                a=true;
               
                s2 += s.substring(i+1);
                String sa = s.substring(0,i);
                s2+=sa;
            
            }



            
        }
        System.out.println(s2+""+S3);
    }


    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        piglatin(s);
    
}
}