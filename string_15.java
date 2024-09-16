
import java.util.*;
public class string_15 {
    // public static void longest_word(String s){
    //     String[] arr= s.split(" ");
    //     String s1 = "";
    //     for(int i=0 ; i< arr.length;i++){
    //         String g = arr[i];
    //         if(g.length()<=s1.length())
    //         s1 = s1 + " " + g;
    //         if(g.length()>=s1.length())
    //         s1 = g + " " + s1;
            
    //     }
    //     System.out.println(s1);
        
    // }

    public static void longest_word(String s) {
        // Split the input string into an array of words
        String[] arr = s.split(" ");
        
        // Sort the words by their length
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        
        // Join the sorted words into a single string and print them
        String result = String.join(" ", arr);
        System.out.println("Words sorted by length: " + result);
    }
    
    public static void main(String[] args) {
        System.out.println("enter the name:  ");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine() ;
        longest_word(s);
}
}