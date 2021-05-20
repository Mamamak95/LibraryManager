package library;

import java.util.ArrayList;
import java.util.Scanner;
public class AfterLogin extends Check{

    public AfterLogin() {
        int bookNum = 3;
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<String>> bookDatas = new ArrayList<ArrayList<String>>();
        ArrayList<String> bookName1 = new ArrayList<>();
        bookName1.add("1");
        bookName1.add("C Programming");
        bookName1.add("0");
        bookDatas.add(bookName1);

        ArrayList<String> bookName2 = new ArrayList<>();
        bookName2.add("2");
        bookName2.add("Java For Beginner");
        bookName2.add("0");
        bookDatas.add(bookName2);

        ArrayList<String> bookName3 = new ArrayList<>();
        bookName3.add("3");
        bookName3.add("Programming Python");
        bookName3.add("0");
        bookDatas.add(bookName3);
        while (true) {
            System.out.println("1:List of Books\n2:Add a book\n3:Loan a book\n4:Return a book\nQ:Log out");
            String select = scan.nextLine();





            if (select.equals("1") ) {

                for (int i = 0; i < bookNum; i++) {

                    System.out.print(bookDatas.get(i).get(0) + "  " + bookDatas.get(i).get(1) + "  ");
                    if (bookDatas.get(i).get(2).equals("-1")) {
                        System.out.println("*loaned");
                    } else {
                        System.out.println(" ");
                    }

                }
                System.out.println("\n------------------");

            }
            if (select.equals("2")) {
                bookNum++;
                String addBookNum = "" + bookNum;
                String addbookname;


                System.out.println("A book name:");

                addbookname=scan.nextLine();

                ArrayList<String> addBook = new ArrayList<>();
                addBook.add(addBookNum);
                addBook.add(addbookname);
                addBook.add("0");
                bookDatas.add(addBook);
                System.out.println("The book is added on list");
            }
            if (select.equals("3")) {

                for (int i = 0; i < bookDatas.size(); i++) {

                    System.out.print(bookDatas.get(i).get(0) + "  " + bookDatas.get(i).get(1) + "  ");
                    if (bookDatas.get(i).get(0).equals("-1")) {
                        System.out.println("*loaned");
                    } else {
                        System.out.println(" ");
                    }

                }
                System.out.println("\n------------------");
                System.out.println("Input a book number.");
                String loanBook = scan.nextLine();
                String booknum = null;

                String loanbookname = null;
                int p;
                int st=-1;//행렬위치
                for (p=0; p < bookNum; p++) {

                    if (bookDatas.get(p).get(0).equals(loanBook)) {
                        st=p;
                        loanbookname = bookDatas.get(p).get(1);
                        p++;
                        booknum = "" + p;

                    }

                }

                if (st!= -1) {
                    ArrayList<String> temp=new ArrayList<>();

                    temp.add(booknum);
                    temp.add(loanbookname);
                    temp.add("-1");
                    bookDatas.add(temp);

                    bookDatas.remove(st);
                    int i=0;
                    while(true)
                    {
                    i++;
                    if(i==bookDatas.size()-st)break;


                        int loannum = st + i+1;

                            ArrayList<String> temp1 = new ArrayList<>();
                            String booknum1 = "" + loannum;
                            temp1.add(booknum1);

                            String loanbookname1 = bookDatas.get(st).get(1);
                            String loancheck = bookDatas.get(st).get(2);
                            temp1.add(loanbookname1);
                            temp1.add(loancheck);

                            bookDatas.remove(st);
                            bookDatas.add(temp1);


                    }

                }

            }
            if (select.equals("4")) {

                System.out.println("Input a book number.");
                String loanBook = scan.nextLine();
                String booknum = null;

                String loanbookname = null;
                int p;
                int st=-1;//행렬위치
                for (p=0; p < bookNum; p++) {

                    if (bookDatas.get(p).get(0).equals(loanBook)) {
                        st=p;
                        loanbookname = bookDatas.get(p).get(1);
                        p++;
                        booknum = "" + p;

                    }

                }

                if (st!= -1) {
                    ArrayList<String> temp=new ArrayList<>();

                    temp.add(booknum);
                    temp.add(loanbookname);
                    temp.add("0");
                    bookDatas.add(temp);

                    bookDatas.remove(st);
                    int i=0;
                    while(true)
                    {
                        i++;
                        if(i==bookDatas.size()-st)break;


                        int loannum = st + i+1;

                        ArrayList<String> temp1 = new ArrayList<>();
                        String booknum1 = "" + loannum;
                        temp1.add(booknum1);

                        String loanbookname1 = bookDatas.get(st).get(1);
                        String loancheck = bookDatas.get(st).get(2);
                        temp1.add(loanbookname1);
                        temp1.add(loancheck);

                        bookDatas.remove(st);
                        bookDatas.add(temp1);


                    }

                }

            }

            if (select.equals("q") || select.equals("Q")) {
                break;

            }

        }
    }

}


