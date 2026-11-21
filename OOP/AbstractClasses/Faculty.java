package AbstractClasses;
import java.util.*;

public class Faculty extends LibraryUser {
   final int borrowlimit = 5;
   

   Faculty(String name){
       super(name);
   }
    @Override
    void borrowbooks(int numOfBooks, Scanner sn) {
        if (numOfBooks > borrowlimit){
            System.out.println(name + " cannot be borrowed more than " + borrowlimit);
            failed = true;
           
        } else {
            for(int i = 1; i <= numOfBooks; i++){
                System.out.println("Enter the title of the Book" + i + ": ");
                String bTitle = sn.nextLine();
                borrowedlist.add(bTitle);
            }
        }
    }
   @Override
    String getUserType() {
        return "Student";
    }
   
    
    
}




