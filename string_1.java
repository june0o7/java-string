<<<<<<< HEAD
import java.io.*;
import java.util.*;
class string_1{
    public static void reverse1(String s){
        String st="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            st = ch+st;
        }
        System.out.println(st);
    }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        reverse1(s);
        sc.close();

        
    }
=======
import java.io.*;
import java.util.*;
class string_1{
    public static void reverse1(String s){
        String st="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            st = ch+st;
        }
        System.out.println(st);
    }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s =sc.nextLine();
        reverse1(s);
        sc.close();

        
    }
>>>>>>> 0c9ce6c6c091f76f3856d98f64248a270c475b79
}