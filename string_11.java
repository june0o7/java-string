import java.util.*;

public class string_11 {
    
    public static void occurance (String str , String word){

        String[] arr = str.split(" ");
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(word.equals(arr[i])) count++;
        }
        System.out.println(count);


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String s1 = sc.nextLine();
        System.out.println("enter the target word: ");
        String s2 = sc.nextLine();
        occurance(s1, s2);
    }
}
