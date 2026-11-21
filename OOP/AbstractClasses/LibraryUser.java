package AbstractClasses;

import java.util.*;

public abstract class LibraryUser {

    String name;
    ArrayList<String> borrowedlist = new ArrayList<>();
    boolean failed;
    

    LibraryUser(String name) {
        this.name = name;
    }

    abstract void borrowbooks(int numOfBooks, Scanner sn);

    abstract String getUserType();

    void displayborrowedbooks() {
        System.out.println("\n" + name + " (" + getUserType() + ") borrowed these books: ");
        for (String book : borrowedlist) {
            System.out.println(getUserType() + " borrowed " + book);
        }
        System.out.println("Total Books Borrowed: " + borrowedlist.size());
    }
}
