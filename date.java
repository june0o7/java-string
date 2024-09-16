import java.util.*;
import java.text.*;
//did not understand logic.............................................
public class date {
    public static void date(String s){//dd/mm/yyyy
         // Define the date format
         SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");

         // Setting lenient to false ensures strict parsing of the date
         sdf.setLenient(false);
 
         try {
             // Parse the date
             Date date = sdf.parse(s);
            //  return true; 
             // Date is valid
             System.out.println("valid");
            } catch (ParseException e) {
                // return false; 
                // Date is invalid
                System.out.println("not valid");

         }

    }
    public static void main(String[] args) {
        System.out.println("enter the date:  ");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine() ;
        date(s);

    }
    
}
