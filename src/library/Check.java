package library;

import java.util.ArrayList;

public class Check extends LibraryMain{


    private static String iD,pW;
    private static ArrayList<ArrayList<String>> datas=new ArrayList<>();
    public static void original(){ArrayList<String> user1=new ArrayList<>();

        user1.add("ktoxptof");
        user1.add("41288630");
        datas.add(user1);

    ArrayList<String> user2=new ArrayList<>();
        user2.add("badc");
        user2.add("2143");
        datas.add(user2);
    }
    public static void signup(String id, String pw) {

        for (int i = 0; i < datas.size(); i++) {
            if (id.equals(datas.get(i).get(0))) {
                System.out.println("Who already uses this ID");
                LibraryMain restart = new LibraryMain();
            }


        }
        ArrayList<String> newUser = new ArrayList<>();

        iD = id;
        pW = pw;
        newUser.add(iD);
        newUser.add(pW);
        datas.add(newUser);

        System.out.println("Finish sign up");


    }
    public static void check(String id, String pw) {


        int idcheck = -1;

        for (int i = 0; i < datas.size(); i++) {
            if (id.equals(datas.get(i).get(0))) {
                idcheck = i;

            }
        }
        if (idcheck != -1) {
            if (datas.get(idcheck).get(1).equals(pw)) {

                System.out.println("Loged in");

                AfterLogin afterLogin = new AfterLogin(id);
            }

        } else {
            System.out.println("Failed");

        }

    }



}
