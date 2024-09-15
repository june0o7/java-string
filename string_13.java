import java.util.*;

public class string_13 {
    
    public static void oddname(String s){
        boolean count = true;
        for(int i = 0 ; i< s.length();i++){
            char ch = s.charAt(i);
            int a = ch;
            System.out.println(a);
            if(a%2==0){
                count=false;
             System.out.println(s+" is not a odd name");
                break;
            }
            
        }
        if(count)System.out.println(s+" is a odd name ");

    }
    public static void main(String[] args) {
        System.out.println("enter the name:  ");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine() ;
        oddname(s);
    }
    
}
