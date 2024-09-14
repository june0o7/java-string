import java.io.IOException;
import java.util.*;

public class string_9 {
    public static void replaceAWithAN(String str) {
         System.out.println(  str.replace(" a ", " an "));  
    }

    // public static String replaceAWithAN(String str) {
    //     String[] words = str.split(" ");  
    //     StringBuilder result = new StringBuilder();

    //     for (String word : words) {
            
    //         if (word.equals("A")) {
    //             result.append("AN ");
    //         } else {
    //             result.append(word).append(" ");
    //         }
    //     }

    //     return result.toString().trim();  
    // }


     public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        replaceAWithAN(s);


     }
    
}
