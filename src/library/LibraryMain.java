package library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Check.original();
        while(true) {
            System.out.println("1:Login\n2:Sign up\nQ:Quit");
            String select;

            select = scan.next();
            if (select.equals("1") ||select.equals("1")) {
                //Login login=new Login();

                //기본 저장된 아이디
                //id: abcd     pw:1234
                //id: junyoung pw:32197721


            }
            if(select.equals("2")){
                System.out.print("ID: ");
                String newID=scan.next();
                System.out.println("PW: ");
                String newPW=scan.next();

                String changedID=Encryption.encryption(newID);
                String changedPW=Encryption.encryption(newPW);
                Check.signup(changedID,changedPW,1);


            }
            if (select.equals("q")||select.equals("Q")) {
                break;
            }
        }
    }
}
