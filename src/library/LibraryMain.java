package library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("L:Login\nQ:Quit");
            String select;

            select = scan.next();
            if (select.equals("l") ||select.equals("L")) {
                AfterLogin login=new AfterLogin();

            }

            if (select.equals("q")||select.equals("Q")) {
                break;
            }
        }
    }
}
/*
회원가입
일반유저or사서-ID PW 분류 (hash 알고리즘 저장) 중복확인
로그인->조회(대출한 책 조회) - 대출 반납
로그인->도서목록-대출
로그인->도서추가(특정아이디) 도서목록조회
*/