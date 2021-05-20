package library;

import java.util.ArrayList;

public class BookList {
    ArrayList<ArrayList<String>> booklist = new ArrayList<>();
    public void Booklist(){

        ArrayList<String> bookName1 = new ArrayList<>();
        bookName1.add("1");
        bookName1.add("C Programming");
        bookName1.add("0");
        booklist.add(bookName1);

        ArrayList<String> bookName2 = new ArrayList<>();
        bookName2.add("2");
        bookName2.add("Java For Beginner");
        bookName2.add("0");
        booklist.add(bookName2);

        ArrayList<String> bookName3 = new ArrayList<>();
        bookName3.add("3");
        bookName3.add("Programming Python");
        bookName3.add("0");
        booklist.add(bookName3);

        for(int i=0;i<booklist.size();i++){
            int j;
            for(j=0;j<2;j++);

            System.out.println(booklist.get(i).get(j));
        }
    }

    public void addBook(String bookNum, String bookName, String loan) {
        ArrayList<String> bookinfo = new ArrayList<>();

        bookinfo.add(bookNum);
        bookinfo.add(bookName);
        bookinfo.add(loan);
        booklist.add(bookinfo);


    }
}
