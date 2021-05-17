package library;
import java.util.Scanner;
public class AfterLogin {
    public AfterLogin() {
        System.out.println("B:List of Books\nA:Add a book\nL:Loan a book\nR:Return a book");
        Scanner scan=new Scanner(System.in);
        String select=scan.next();
        int countAdded=0;
        if(select.equals("b")||select.equals("B")){

        }
        if (select.equals("a")||select.equals("A")){
            countAdded++;

        }
        if (select.equals("l")||select.equals("L")){

        }
    }

}
