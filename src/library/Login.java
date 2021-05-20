package library;

import java.util.Scanner;

public class Login {

    public Login(){
        Scanner sc=new Scanner(System.in);
        System.out.print("ID:");
        String id;
        id=sc.next();
        System.out.print("Password:");
        String password;
        password=sc.next();
        Check check=new Check();
        Encryption ecrypto=new Encryption();
        String inputid=Encryption.encryption(id);
        String inputpw=Encryption.encryption(password);

        Check.check(inputid,inputpw);


    }




}
